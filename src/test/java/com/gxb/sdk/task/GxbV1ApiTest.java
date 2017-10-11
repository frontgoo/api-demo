package com.gxb.sdk.task;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gxb.sdk.api.GxbV1Api;
import com.gxb.sdk.api.AuthApi;
import com.gxb.sdk.client.GxbApiFactory;
import com.gxb.sdk.parm.AuthParm;
import com.gxb.sdk.parm.AuthRequest;
import com.gxb.sdk.parm.AuthToken;
import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.data.enums.ArgumentTypeEnum;
import com.gxb.sdk.parm.data.enums.ArgumentsAgainEnum;
import com.gxb.sdk.parm.data.enums.AuthAgainEnum;
import com.gxb.sdk.parm.data.enums.AuthItemEnum;
import com.gxb.sdk.parm.data.enums.BizRetCode;
import com.gxb.sdk.parm.data.enums.CaptchaTypeEnum;
import com.gxb.sdk.parm.data.enums.LoginProcessEnum;
import com.gxb.sdk.parm.data.vo.ArgumentVo;
import com.gxb.sdk.parm.data.vo.AuthArgumentsVo;
import com.gxb.sdk.parm.data.vo.AuthLoginVo;
import com.gxb.sdk.parm.data.vo.CaptchaVo;
import com.gxb.sdk.parm.data.vo.DictionaryVo;
import com.gxb.sdk.parm.data.vo.OptionArgumentVo;
import com.gxb.sdk.util.Base64;
import com.gxb.sdk.util.FileUtils;

import retrofit2.Response;

/**
 * V1版本授权项api调用. 社保、学信、人行征信、京东、简历
 */
public class GxbV1ApiTest {
    private static final Logger logger = LoggerFactory.getLogger(GxbV1ApiTest.class);

    static GxbApiFactory gxbApiFactory = GxbApiFactory.builder().baseUrl("https://prod.gxb.io/crawler/auth/").build();
    static GxbV1Api abstractApi = gxbApiFactory.newApi(GxbV1Api.class);

    /**
     * 此处请使用开户时创建的appid 和appSecurity，不然无法收到推送数据
     */
    protected static String appId = "gxba57f409ca1fe2dfa";
    protected static String appSecurity = "2d1844d9dd8540149e936b0125c4f8de";

    private static boolean authLoginFinished = false;// 是否已经调用过了auth_login标记
    private static boolean loginProcessFinished = false;// 登录过程是否完成，这个标记表示是否会有数据抓取

    protected static AuthParm getAuthParm() {
        // 商户自定义授权流水标示，最长32位
        String sequenceNo = UUID.randomUUID().toString().replace("-", "");

        // 调用京东授权项
        return new AuthParm(sequenceNo, AuthItemEnum.JD.getValue(), System.currentTimeMillis(), "周海松", "18258171452", "330682199011221410");

        // 调用人行征信授权项
        // return new AuthParm(sequenceNo, AuthItemEnum.CREDIT.getValue(),
        // System.currentTimeMillis(), "周海松", "18258171452", "330682199011221410");

        // 调用社保授权项
        // return new AuthParm(sequenceNo, AuthItemEnum.SECURITY.getValue(),
        // System.currentTimeMillis(), "周海松", "18258171452", "330682199011221410");

        // 调用学信授权项
        // return new AuthParm(sequenceNo, AuthItemEnum.XUEXIN.getValue(),
        // System.currentTimeMillis(), "周海松", "18258171452", "330682199011221410");
    }

    /**
     * 获取授权token
     *
     * @return
     * @throws IOException
     */
    protected static AuthToken getAuthToken() throws IOException {
        AuthApi authApi = gxbApiFactory.newApi(AuthApi.class);
        AuthParm parm = getAuthParm();
        Response<GxbResponse<AuthToken>> response =
                authApi.auth(AuthRequest.builder(appId, appSecurity, parm.getSequenceNo(), parm.getTimestamp(), parm.getAuthItem())
                        .phone(parm.getPhone()).name(parm.getName()).idcard(parm.getIdcard()).build()).execute();
        AuthToken authToken = response.body().getData();
        logger.info("授权成功. authToken: " + authToken);
        return authToken;
    }

    private static boolean authLogin(String token, Map<String, String> params) throws Exception {
        GxbResponse<AuthLoginVo> response = abstractApi.authLogin(params).execute().body();
        if (response == null || BizRetCode.SUCCESS.getCode() != response.getRetCode()) {
            System.err.println("授权登录失败：" + response.getRetMsg());
            return false;
        }

        authLoginFinished = true;
        AuthLoginVo authLoginVo = response.getData();

        // 是否需要多次授权
        String authAgain = authLoginVo.getAuthAgain();
        // 登录过程是否结束，如果登录过程没有结束则不会抓取任何数据，所以接入方需要根据这个字段来判断是否会收到数据
        String loginProcess = authLoginVo.getLoginProcess();

        if (LoginProcessEnum.SUCCESS.getValue().equals(loginProcess)) {
            loginProcessFinished = true;// 登录过程完毕，服务端进行数据抓取
        }

        // 判断是否需要多次授权
        if (AuthAgainEnum.NO.getValue().equals(authAgain)) {
            // 不需要后面的授权，授权结束
            System.out.println("授权成功，等待服务端异步推送数据");
            return false;
        }

        return true;
    }

    private static void authAgain(String token) throws Exception {
        Map<String, String> params = getAuthArguments(token);
        if (params == null) {
            System.err.println("获取授权参数项失败");
            return;
        }

        // 第三步 再次授权登录 auth_again
        GxbResponse<AuthLoginVo> response = abstractApi.authAgain(params).execute().body();
        if (response == null || BizRetCode.SUCCESS.getCode() != response.getRetCode()) {
            System.err.println("授权登录失败：" + response.getRetMsg());
            return;
        }

        AuthLoginVo authLoginVo = response.getData();

        // 是否需要多次授权
        String authAgain = authLoginVo.getAuthAgain();
        // 登录过程是否结束，如果登录过程没有结束则不会抓取任何数据，所以接入方需要根据这个字段来判断是否会收到数据
        String loginProcess = authLoginVo.getLoginProcess();

        if (LoginProcessEnum.SUCCESS.getValue().equals(loginProcess)) {
            loginProcessFinished = true;// 登录过程完毕，服务端进行数据抓取
        }

        // 判断是否需要多次授权
        if (AuthAgainEnum.NO.getValue().equals(authAgain)) {
            // 不需要后面的授权，授权结束
            System.out.println("再次授权成功，等待服务端异步推送数据");
            return;
        }

        // 循环
        authAgain(token);
    }


    // 获取授权参数项，并让用户输入授权参数对应的值
    private static Map<String, String> getAuthArguments(String token) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", token);
        return getAuthArguments(token, params);
    }

    // 获取授权参数项，并让用户输入授权参数对应的值
    private static Map<String, String> getAuthArguments(String token, Map<String, String> params) throws Exception {
        GxbResponse<AuthArgumentsVo> response = !authLoginFinished
                ? abstractApi.getAuthArguments(params).execute().body()
                : abstractApi.getAuthAgainArguments(params).execute().body();
        if (response == null || BizRetCode.SUCCESS.getCode() != response.getRetCode()) {
            System.err.println("获取授权参数项失败：" + response.getRetMsg());
            return null;
        }

        AuthArgumentsVo authArgumentsVo = response.getData();

        // 是否再次需要调用 get_auth_arguments接口
        String argumentsAgain = authArgumentsVo.getArgumentsAgain();

        // 协议名称
        String agreementName = authArgumentsVo.getAgreementName();
        // 协议地址
        String agreementUrl = authArgumentsVo.getAgreementUrl();
        // 授权须知
        String notice = authArgumentsVo.getNotice();

        Map<String, String> inputParams = receiveArgumentInput(token, authArgumentsVo);// 接收用户输入参数

        // 判断是否需要再次调用 get_auth_arguments接口
        if (ArgumentsAgainEnum.YES.getValue().equals(argumentsAgain)) {
            // 循环
            return getAuthArguments(token, inputParams);
        }

        return inputParams;// 返回接收的参数
    }


    private static Map<String, String> receiveArgumentInput(String token, AuthArgumentsVo authArgumentsVo) throws Exception {
        Map<String, String> inputParams = new HashMap<String, String>();// 重新初始化一个参数map，用于存放用户输入的参数
        inputParams.put("token", token);// 默认token都需要带上

        // 授权参数项列表，根据这个列表展示参数输入框，接收用户输入
        List<ArgumentVo> argumentList = authArgumentsVo.getArgumentList();
        for (ArgumentVo argumentVo : argumentList) {
            // 参数名称，这个参数名称是接收用户输入之后对应需要传递给服务接口的参数名
            String argumentName = argumentVo.getArgumentName();
            // 参数类型ArgumentTypeEnum定义
            String argumentType = argumentVo.getArgumentType();
            // 输入框的提示信息
            String hint = argumentVo.getHint();
            // 输入框前面的提示信息
            String title = argumentVo.getTitle();
            // 是否必须有值得标识RequireTypeEnum定义
            String requireType = argumentVo.getRequireType();

            // 如果argumentType=options则会返回这个列表，内容表示某些参数需要用户选择
            List<OptionArgumentVo> optionArgumentList = argumentVo.getOptionArgumentList();

            // 如果是argumentType为image_code
            // 需要调用get_auth_captcha接口
            if (ArgumentTypeEnum.IMAGE_CODE.getValue().equals(argumentType)) {
                // 获取图片验证码
                getImageAuthCaptcha(token, argumentName);
            } else if (ArgumentTypeEnum.SMS_CODE.getValue().equals(argumentType)) {
                // 获取短信验证码
                getSmsAuthCaptcha(token, argumentName);
            } else if (ArgumentTypeEnum.OPTIONS.getValue().equals(argumentType)) {
                // 选项，这个类型的参数项意思就是让用户下拉选择
                // optionArgumentList列表中，各个dictionaryList的列表项是有父子关系的，调用者需要自己根据父子关系暂时联动效果，比如第一项选择了浙江省，那么第二项出来的应该是浙江下面的城市
                receiveOptionArgumentInput(inputParams, title, hint, optionArgumentList);
            }


            // 接收其他简单文本输入的参数
            if (!ArgumentTypeEnum.OPTIONS.getValue().equals(argumentType)) {
                // 这里输入文本参数值

                Scanner scanner = new Scanner(System.in);
                System.out.println(title + " " + hint + "：");
                String inputValue = scanner.nextLine();// 接收用户输入，如果是验证码则根据具体内容输入

                inputParams.put(argumentName, inputValue);
            }
        }

        return inputParams;
    }

    private static boolean getImageAuthCaptcha(String token, String argumentName) throws Exception {
        // 获取图片验证码
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", token);
        params.put("argumentName", argumentName);
        params.put("captchaType", CaptchaTypeEnum.IMAGE.getValue());// 图片验证码
        GxbResponse<CaptchaVo> response =
                !authLoginFinished ? abstractApi.getAuthCaptcha(params).execute().body() : abstractApi.getAuthAgainCaptcha(params).execute().body();
        if (response == null || BizRetCode.SUCCESS.getCode() != response.getRetCode()) {
            System.err.println("获取图片验证码失败：" + response.getRetMsg());
            return false;
        }

        CaptchaVo captchaVo = response.getData();
        String baseImageData = captchaVo.getImageData();// 图片验证码是以二进制的base64编码后的字符串传递

        // 这里用于展示图片，将baseImageData输出到文件系统
        byte[] bytes = Base64.decode(baseImageData);
        String filePath = "/Users/yediwu/temp/api/" + System.currentTimeMillis() + ".jpg";// 存放位置
        FileUtils.outputDataToFile(bytes, filePath);// 输出到文件
        System.out.println("图片验证码已存放到 " + filePath);
        return true;
    }

    private static boolean getSmsAuthCaptcha(String token, String argumentName) throws Exception {
        // 获取图片验证码
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", token);
        params.put("argumentName", argumentName);
        params.put("captchaType", CaptchaTypeEnum.SMS.getValue());// 短信验证码
        GxbResponse<CaptchaVo> response =
                !authLoginFinished ? abstractApi.getAuthCaptcha(params).execute().body() : abstractApi.getAuthAgainCaptcha(params).execute().body();
        if (response == null || BizRetCode.SUCCESS.getCode() != response.getRetCode()) {
            System.err.println("获取短信验证码失败：" + response.getRetMsg());
            return false;
        }

        System.out.println("获取短信验证码成功，短信已下发");
        return true;
    }

    // 接收用户对于下拉选项的输入
    private static void receiveOptionArgumentInput(Map<String, String> inputParams, String title, String hint,
            List<OptionArgumentVo> optionArgumentList) throws Exception {
        for (OptionArgumentVo optionArgumentVo : optionArgumentList) {
            // 参数名称，这个是用户选中一个之后需要向服务端提交的参数名
            String optionArgumentName = optionArgumentVo.getArgumentName();
            // 字典，即从中选择某一项
            List<DictionaryVo> dictionaryList = optionArgumentVo.getDictionaryList();

            System.out.println("从以下选项中选择(括号中的值)：");
            for (DictionaryVo dictionaryVo : dictionaryList) {
                System.out.println("\t" + dictionaryVo.getName() + "(" + dictionaryVo.getCode() + ")");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println(title + " " + hint + "：");
            String inputValue = scanner.nextLine();// 接收用户输入

            inputParams.put(optionArgumentName, inputValue);// 注意这里要穿的是
                                                            // optionArgumentVo对象的argumentName
        }
    }

    public static void main(String[] args) throws Exception {
        // 第一步获取token get_auth_token
        AuthToken authToken = getAuthToken();
        String token = authToken.getToken();
        // 第二步 获取授权参数项，并让用户输入相应的值 get_auth_arguments
        Map<String, String> params = getAuthArguments(token);
        if (params == null) {
            System.err.println("获取授权参数项失败");
            return;
        }

        // 第三步 授权登录 auth_login
        boolean needAuthAgain = authLogin(token, params);

        // 后面则需要调用get_auth_again_arguments,auth_again,get_auth_again_captcha接口的组合
        if (needAuthAgain) {// 需要多次授权

            // 第四步 再次授权 auth_again
            authAgain(token);
        }
    }
}
