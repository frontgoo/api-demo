/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.task;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gxb.sdk.api.AuthApi;
import com.gxb.sdk.client.GxbApiFactory;
import com.gxb.sdk.parm.AuthParm;
import com.gxb.sdk.parm.AuthRequest;
import com.gxb.sdk.parm.AuthToken;
import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.LoginInfo;
import com.gxb.sdk.parm.QrCodeResult;
import com.gxb.sdk.parm.Status;
import com.gxb.sdk.parm.Status.PhaseStatus;
import com.gxb.sdk.parm.config.LoginField;
import com.gxb.sdk.parm.config.LoginForm;
import com.gxb.sdk.parm.config.LoginForm.LoginFormType;
import com.gxb.sdk.util.GsonUtil;
import com.gxb.sdk.view.JPaneView;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Response;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月23日 下午2:47:49
 */
public abstract class AbstractGxbTest {
    private static final Logger logger = LoggerFactory.getLogger(AbstractGxbTest.class);
    private OkHttpClient client = new OkHttpClient();

    protected GxbApiFactory moxieApiFactory = GxbApiFactory.builder().baseUrl("http://demo.gxb.io/crawler/auth/").build();;
    protected String appId = "gxba57f409ca1fe2dfa";
    protected String appSecret = "2d1844d9dd8540149e936b0125c4f8de";

    protected JPaneView view = null;
    protected Map<String, JTextField> fieldTextMap = new HashMap<>();



    protected abstract AuthParm getAuthParm();

    protected abstract Status refreshLoginQrCode(String token) throws IOException;

    protected abstract Status refreshLoginPicCode(String token) throws IOException;

    protected abstract Status refreshLoginSmsCode(String token) throws IOException;

    protected abstract Status submitLogin(String token, LoginInfo loginInfo) throws IOException;

    protected abstract Status getStatus(String token) throws IOException;

    protected abstract Status submitVarifyCode(String token, String code) throws IOException;



    /**
     * 获取授权token
     * 
     * @return
     * @throws IOException
     */
    protected AuthToken getAuthToken() throws IOException {
        AuthApi authApi = moxieApiFactory.newApi(AuthApi.class);
        AuthParm parm = getAuthParm();
        Response<GxbResponse<AuthToken>> response =
                authApi.auth(AuthRequest.builder(appId, appSecret, parm.getSequenceNo(), parm.getTimestamp(), parm.getAuthItem())
                        .phone(parm.getPhone()).name(parm.getName()).idcard(parm.getIdcard()).build()).execute();
        AuthToken authToken = response.body().getData();
        logger.info("授权成功. authToken: " + authToken);
        return authToken;
    }



    /**
     * 二维码登录form初始化
     * 
     * @param loginForm
     * @return
     * @throws IOException
     */
    protected boolean qrFormInit(LoginForm loginForm, AuthToken token) throws IOException {
        Status status = refreshLoginQrCode(token.getToken());
        if (status != null && PhaseStatus.REFRESH_QR_CODE_SUCCESS.equals(status.getPhaseStatus())) {
            QrCodeResult qrCodeResult = GsonUtil.fromJson(status.getExtra().getRemark(), QrCodeResult.class);
            logger.info("二维码获取成功，httpQrcode:{},rpcQrcode:{},weisite{}", qrCodeResult.getHttpQRCode(), qrCodeResult.getRpcQRCode(),
                    qrCodeResult.getWebsite());
            return mockQrCodeLoginView(loginForm, status, qrCodeResult);
        } else {
            logger.warn("{}刷新二维码失败", loginForm.getFormName());
            return false;
        }
    }

    /**
     * 模拟初始化二维码登录view展示，以下代码仅用于生产测试view，无实际意义
     * 
     * @param loginForm
     * @param status
     * @param qrCodeResult
     * @throws IOException
     */
    protected boolean mockQrCodeLoginView(LoginForm loginForm, Status status, QrCodeResult qrCodeResult) throws IOException {
        // 生成二维码图片
        okhttp3.Response response = client.newCall(new Request.Builder().url(qrCodeResult.getHttpQRCode()).build()).execute();
        BufferedImage image = ImageIO.read(new ByteArrayInputStream(response.body().bytes()));

        logger.info("二维码上方展示：{}，二维码下方引导的tips：{}", status.getExtra().getTitle(), status.getExtra().getTips());

        JPanel panel = new JPanel();
        JLabel title = new JLabel(status.getExtra().getTitle());
        JLabel tips = new JLabel(status.getExtra().getTips());
        panel.add(title);
        panel.add(tips);
        view = new JPaneView(panel, loginForm.getFormName(), new ImageIcon(image), JOptionPane.getRootFrame());
        logger.info("模拟二维码渲染成功，请根据提示扫描二维码。");
        return true;
    }



    /**
     * 普通账号密码登录form初始化
     * 
     * @param loginForm
     * @return
     * @throws IOException
     */
    protected boolean normalFormInit(LoginForm loginForm, AuthToken token) throws IOException {
        logger.info("当前授权方式的注册链接为：{}", loginForm.getRegisterUrl());
        logger.info("当前授权方式的登录提示为：{}", loginForm.getLoginTips());
        logger.info("当前授权方式的密码重置方式为：{}", loginForm.getPwdResetConfig());
        logger.info("当前授权方式的帮助页面链接为：{}", loginForm.getHelpUrl());
        logger.info("当前授权方式的找回用户名链接为：{}", loginForm.getRetrieveUserNameUrl());
        return mockNormalLoginView(loginForm, token);
    }


    /**
     * 模拟初始化普通账号密码登录view展示，以下代码仅用于生产测试view，无实际意义
     * <p>
     * 对于sms（随机短信验证码）主动触发发送 对于pic（图片验证码）需要主动刷新图片验证码
     * <p>
     * 
     * @param loginForm
     * @throws IOException
     */
    protected boolean mockNormalLoginView(LoginForm loginForm, AuthToken token) throws IOException {
        JPanel panel = new JPanel();
        String imageBase64 = null;
        for (LoginField loginField : loginForm.getFields()) {
            // 此处demo不对输入做具体的检测和校验，商户具体实现时，可使用以下配置
            logger.info("授权需要字段名：{}，字段中文名：{}，字段描述：{}，字段校验正则：{}，字段校验提示：{}", loginField.getField(), loginField.getFieldName(),
                    loginField.getFieldDesc(), loginField.getCheckRegex(), loginField.getFieldTips());
            JLabel lbl = new JLabel(loginField.getFieldName() + ": ");
            JTextField txt = new JTextField(20);
            fieldTextMap.put(loginField.getField(), txt);
            panel.add(lbl);
            panel.add(txt);
            if (loginField.getFieldExtraConfig() != null) {
                switch (loginField.getFieldExtraConfig().getFieldExtraType()) {
                    case SMS:
                        logger.info("{}需要发送短信验证码", loginField.getField());
                        Status smsResult = refreshLoginSmsCode(token.getToken());
                        if (smsResult == null || PhaseStatus.REFRESH_SMS_SUCCESS != smsResult.getPhaseStatus()) {
                            return false;
                        } else {
                            logger.info("{}随机短信验证码发送成功", loginField.getField());
                        }
                        break;
                    case PIC:
                        logger.info("{}需要刷新图片验证码", loginField.getField());
                        Status picResult = refreshLoginPicCode(token.getToken());
                        if (picResult == null || PhaseStatus.REFRESH_IMAGE_SUCCESS != picResult.getPhaseStatus()) {
                            return false;
                        } else {
                            imageBase64 = picResult.getExtra().getRemark();
                            // 在线图片验证码base64转换地址：http://www.vgot.net/test/image2base64.php?
                            logger.info("{}图片验证码刷新成功，图片验证码(base64): {}", loginField.getField(), imageBase64);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        if (imageBase64 != null) {
            byte[] imageBytes = Base64.decodeBase64(imageBase64);
            view = new JPaneView(panel, loginForm.getFormName(), new ImageIcon(ImageIO.read(new ByteArrayInputStream(imageBytes))),
                    JOptionPane.getRootFrame());
        } else {
            view = new JPaneView(panel, loginForm.getFormName(), null, JOptionPane.getRootFrame());
        }
        return true;
    }


    /**
     * 轮训处理流程，目前只有登录和抓取过程需要采用轮训处理
     * 
     * @param callable
     * @param timeout
     * @return
     * @throws Exception
     */
    protected Status processing(Callable<Status> callable, long timeout) throws Exception {
        long start = System.currentTimeMillis();
        while (true) {
            Status status = callable.call();
            if (status != null) return status;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (System.currentTimeMillis() - start > timeout) break;
        }
        logger.warn("任务执行超时。");
        return null;
    }



    /**
     * 采用swing显示登录的view，mock登录授权流程 *
     * <p>
     * 扫码二维码后关闭窗口/输入账号密码后关闭窗口
     * <p>
     * 
     * @param loginForm
     * @return
     * @throws Exception
     */
    protected void mockJPaneLogin(LoginForm loginForm, AuthToken token) throws Exception {
        String[] options = {"OK"};
        int selectedOption = JOptionPane.showOptionDialog(view.getViewFrame(), view.getPanel(), view.getTitle(), JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, view.getIcon(), options, options[0]);
        if (selectedOption == 0) {
            if (LoginFormType.NORMAL.equals(loginForm.getLoginFormType())) {
                Map<String, String> parm = new HashMap<>();
                for (String name : fieldTextMap.keySet()) {
                    String value = fieldTextMap.get(name).getText();
                    logger.info("获取输入参数名：{}，输入内容：{}", name, value);
                    parm.put(name, value);
                }
                submitLogin(token.getToken(), GsonUtil.fromJson(GsonUtil.toJson(parm), LoginInfo.class));
            }
        }
    }



    /**
     * 交互性状态处理
     * 
     * 在任务状态轮训过程中，出现各种交互性流程，这里同样采用swing mock
     * 
     * @param status
     * @throws Exception
     */
    protected boolean interactiveStatusHandler(Status status, AuthToken token) throws Exception {
        if (status != null) {
            logger.info("当前任务Stage：{}，具体状态：{}", status.getStage(), status.getPhaseStatus());
            switch (status.getPhaseStatus()) {
                case SMS_VERIFY_NEW:
                    logger.info("需要进行短信验证码二次认证.");
                    mockSmsStatusView(status, token);
                    break;
                case IMAGE_VERIFY_NEW:
                    logger.info("需要进行图片验证码二次认证.");
                    mockPicStatusView(status, token);
                    break;
                case QR_VERIFY_NEW:
                    logger.info("需要进行二维码二次认证.");
                    mockQRStatusView(status);
                    break;
                case QR_VERIFY_CONFIRMED:
                    logger.info("二维码已经被确认,对二维码图标进行打钩。");
                    break;
                case LOGIN_FAILED:
                    logger.warn("登录操作失败，提示信息：{}", status.getExtra().getRemark());
                    break;
                case FAILED:
                    logger.warn("任务执行失败，提示信息：{}", status.getExtra().getRemark());
                    break;
                default:
                    logger.info("当前状态{}不需要做任何的交互", status.getPhaseStatus());
                    break;
            }
            return true;
        } else {
            logger.warn("当前任务获取状态异常。");
            return false;
        }
    }

    /**
     * 模拟抓取过程中二维码view展示，以下代码仅用于生成测试view，无实际意义
     * 
     * 在登录，抓取过程中均可能出现
     * 
     * @param status
     * @throws IOException
     */
    protected void mockQRStatusView(Status status) throws IOException {
        QrCodeResult qrCodeResult = GsonUtil.fromJson(status.getExtra().getRemark(), QrCodeResult.class);
        // 生成二维码图片
        okhttp3.Response response = client.newCall(new Request.Builder().url(qrCodeResult.getHttpQRCode()).build()).execute();
        BufferedImage image = ImageIO.read(new ByteArrayInputStream(response.body().bytes()));
        logger.info("抓取过程中二维码上方展示：{}，二维码下方引导的tips：{}", status.getExtra().getTitle(), status.getExtra().getTips());
        JPanel panel = new JPanel();
        JLabel tips = new JLabel(status.getExtra().getTips());
        panel.add(tips);
        view = new JPaneView(panel, status.getExtra().getTitle(), new ImageIcon(image), JOptionPane.getRootFrame());
        logger.info("模拟二维码渲染成功，请根据提示扫描二维码。");
        String[] options = {"OK"};
        int selectedOption = JOptionPane.showOptionDialog(view.getViewFrame(), view.getPanel(), view.getTitle(), JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, view.getIcon(), options, options[0]);
        if (selectedOption == 0) {
            // 二维码验证，不需要提交任务信息，只需要持续刷新状态
        }
    }

    /**
     * 模拟抓取过程中短信验证view展示，以下代码仅用于生成测试view，无实际意义
     * 
     * 在登录，抓取过程中均可能出现
     * 
     * @param status
     * @throws IOException
     */
    protected void mockSmsStatusView(Status status, AuthToken token) throws IOException {
        logger.info("抓取过程中短信验证码上方title展示：{}，提示引导的tips：{}", status.getExtra().getTitle(), status.getExtra().getTips());
        JPanel panel = new JPanel();
        JLabel tips = new JLabel(status.getExtra().getTips());
        JTextField txt = new JTextField(6);
        panel.add(tips);
        panel.add(txt);
        view = new JPaneView(panel, status.getExtra().getTitle(), null, JOptionPane.getRootFrame());
        logger.info("模拟短信验证码渲染成功，请根据提示输入收到的短信验证码。");
        String[] options = {"OK"};
        int selectedOption = JOptionPane.showOptionDialog(view.getViewFrame(), view.getPanel(), view.getTitle(), JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, view.getIcon(), options, options[0]);
        if (selectedOption == 0) {
            submitVarifyCode(token.getToken(), txt.getText());
        }
    }


    /**
     * 模拟抓取过程中图片验证view展示，以下代码仅用于生成测试view，无实际意义
     * 
     * 在登录，抓取过程中均可能出现
     * 
     * @param status
     * @throws IOException
     */
    protected void mockPicStatusView(Status status, AuthToken token) throws IOException {
        logger.info("抓取过程中图片验证码上方title展示：{}，提示引导的tips：{}", status.getExtra().getTitle(), status.getExtra().getTips());
        JPanel panel = new JPanel();
        JLabel tips = new JLabel(status.getExtra().getTips());
        JTextField txt = new JTextField(6);
        panel.add(tips);
        panel.add(txt);
        view = new JPaneView(panel, status.getExtra().getTitle(), null, JOptionPane.getRootFrame());
        logger.info("模拟图片验证码渲染成功，请根据提示输入图片验证结果。");
        String[] options = {"OK"};
        int selectedOption = JOptionPane.showOptionDialog(view.getViewFrame(), view.getPanel(), view.getTitle(), JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, view.getIcon(), options, options[0]);
        if (selectedOption == 0) {
            submitVarifyCode(token.getToken(), txt.getText());
        }
    }


    /**
     * 登录表单配置初始化
     * 
     * @param loginForm
     * @throws IOException
     */
    protected boolean loginFormInit(LoginForm loginForm, AuthToken token) throws IOException {
        switch (loginForm.getLoginFormType()) {
            case QR:
                logger.info("{}采用二维码授权方式初始化", loginForm.getFormName());
                return qrFormInit(loginForm, token);
            case NORMAL:
                logger.info("{}采用普通账号密码授权方式初始化", loginForm.getFormName());
                return normalFormInit(loginForm, token);
            default:
                logger.warn("初始化失败，{}是未知登录类型", loginForm.getFormName());
                return false;
        }
    }



    protected boolean loginFormStatusCheck(LoginForm loginForm) throws IOException {
        switch (loginForm.getStatus()) {
            case NORMAL:
                logger.info("form状态验证成功，{}登录能正常使用,登录模式为{}", loginForm.getFormName(), loginForm.getLoginFormType());
                return true;
            case MAINTAINED:
                logger.warn("form状态验证失败，{}登录正在维护", loginForm.getFormName());
                return false;
            case OFFLINE:
                logger.warn("form状态验证失败，{}登录已下线", loginForm.getFormName());
                return false;
            default:
                logger.warn("form状态验证失败，{}未知form状态", loginForm.getFormName());
                return false;
        }
    }

}
