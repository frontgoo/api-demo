package com.gxb.sdk.api;

import com.gxb.sdk.parm.CodeSubmitRequest;
import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.LoginRequest;
import com.gxb.sdk.parm.Status;
import com.gxb.sdk.parm.config.LoginConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * 运营商API
 */
public interface OperatorApi {
    /**
     * 获取手机号对应的运营商配置
     *
     * @param token 用户的授权token
     * @param phone 用户手机号码
     * @return
     */
    @GET("operator/v2/phone_config/{token}/{phone_number}")
    Call<GxbResponse<LoginConfig>> getOperatorInitConf(@Path("token") String token, @Path("phone_number") String phone);

    /**
     * 获取运营商任务的当前状态
     *
     * @param token
     * @return
     */
    @GET("operator/v2/get_status/{token}")
    Call<GxbResponse<Status>> getStatus(@Path("token") String token);

    /**
     * 刷新运营商登录的登录图片验证码
     *
     * @param token
     * @return
     */
    @GET("operator/v2/refresh_verify_code/{token}")
    Call<GxbResponse<Status>> refreshLoginPicCode(@Path("token") String token);

    /**
     * 刷新运营商登录的短信验证码
     *
     * @param token
     * @return
     */
    @GET("operator/v2/refresh_sms_code/{token}")
    Call<GxbResponse<Status>> refreshLoginSmsCode(@Path("token") String token);

    /**
     * 提交运营商登陆
     *
     * @param token
     * @return
     */
    @POST("operator/v2/login_submit/{token}")
    Call<GxbResponse<Status>> submitLogin(@Path("token") String token, @Body LoginRequest loginRequest);

    /**
     * 提交运营商短信验证码
     *
     * @param token
     * @return
     */
    @POST("operator/v2/code_submit/{token}")
    Call<GxbResponse<Status>> submitCode(@Path("token") String token, @Body CodeSubmitRequest request);
}
