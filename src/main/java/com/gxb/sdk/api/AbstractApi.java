package com.gxb.sdk.api;

import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.data.vo.AuthArgumentsVo;
import com.gxb.sdk.parm.data.vo.AuthLoginVo;
import com.gxb.sdk.parm.data.vo.CaptchaVo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.Map;

/**
 * V1版本授权项API
 */
public interface AbstractApi {

    /**
     * 获取授权参数
     */
    @POST("v1/get_auth_arguments")
    Call<GxbResponse<AuthArgumentsVo>> getAuthArguments(@Body Map<String, String> params) throws Exception;

    /**
     * 获取登录验证码
     */
    @POST("v1/get_auth_captcha")
    Call<GxbResponse<CaptchaVo>> getAuthCaptcha(@Body Map<String, String> params) throws Exception;

    /**
     * 授权登录
     */
    @POST("v1/auth_login")
    Call<GxbResponse<AuthLoginVo>> authLogin(@Body Map<String, String> params) throws Exception;

    /**
     * 获取二次授权参数，目前暂未实际使用
     */
    @POST("v1/get_auth_again_arguments")
    Call<GxbResponse<AuthArgumentsVo>> getAuthAgainArguments(@Body Map<String, String> params) throws Exception;


    /**
     * 获取二次登录验证码，目前暂未实际使用
     */
    @POST("v1/get_auth_again_captcha")
    Call<GxbResponse<CaptchaVo>> getAuthAgainCaptcha(@Body Map<String, String> params) throws Exception;

    /**
     * 二次授权登录，目前暂未实际使用
     */
    @POST("v1/auth_again")
    Call<GxbResponse<AuthLoginVo>> authAgain(@Body Map<String, String> params) throws Exception;
}
