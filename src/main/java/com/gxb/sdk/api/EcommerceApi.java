package com.gxb.sdk.api;

import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.LoginInfo;
import com.gxb.sdk.parm.Status;
import com.gxb.sdk.parm.config.LoginConfig;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 电商API
 */
public interface EcommerceApi {
    /**
     * 根据用户的所在地区获取初始化淘宝配置，gxb讲根据定位信息使用用户附近的ip进行抓取任务，减少异地登录提醒,提升交互体验
     * 
     * ps:取不到或者不传并不会明显影响抓取成功率
     * 
     * @param token 用户的授权token
     * @param longitude 用户手机所在的定位经度
     * @param latitude 用户手机所在的定位维度
     * @return
     */
    @GET("ecommerce/v2/init_config/taobao/{token}")
    Call<GxbResponse<LoginConfig>> getTaobaoInitConf(@Path("token") String token, @Query("longitude") String longitude,
            @Query("latitude") String latitude);

    /**
     * 根据用户的所在地区获取初始化支付宝配置，gxb讲根据定位信息使用用户附近的ip进行抓取任务，减少异地登录提醒,提升交互体验
     * 
     * ps:取不到或者不传并不会明显影响抓取成功率
     * 
     * @param token 用户的授权token
     * @param longitude 用户手机所在的定位经度
     * @param latitude 用户手机所在的定位维度
     * @return
     */
    @GET("ecommerce/v2/init_config/alipay/{token}")
    Call<GxbResponse<LoginConfig>> getAliapyInitConf(@Path("token") String token, @Query("longitude") String longitude,
            @Query("latitude") String latitude);


    /**
     * 获取电商任务的当前状态
     * 
     * @param token
     * @return
     */
    @GET("ecommerce/v2/get_status/{token}")
    Call<GxbResponse<Status>> getStatus(@Path("token") String token);


    /**
     * 刷新电商登录的二维码
     * 
     * @param token
     * @return
     */
    @GET("ecommerce/v2/refresh_qr_code/{token}")
    Call<GxbResponse<Status>> refreshLoginQrCode(@Path("token") String token);


    /**
     * 刷新电商登录的登录图片验证码
     * 
     * @param token
     * @return
     */
    @GET("ecommerce/v2/refresh_verify_code/{token}")
    Call<GxbResponse<Status>> refreshLoginPicCode(@Path("token") String token);


    /**
     * 刷新电商登录的短信验证码，目前暂未实际使用
     * 
     * @param token
     * @return
     */
    @GET("ecommerce/v2/refresh_sms_code/{token}")
    Call<GxbResponse<Status>> refreshLoginSmsCode(@Path("token") String token);


    /**
     * 刷新电商登录的短信验证码，目前暂未实际使用
     * 
     * @param token
     * @return
     */
    @POST("ecommerce/v2/login_submit/{token}")
    Call<GxbResponse<Status>> submitLogin(@Path("token") String token, @Body LoginInfo loginInfo);


    /**
     * 刷新电商登录的短信验证码，目前暂未实际使用
     * 
     * @param token
     * @return
     */
    @POST("ecommerce/v2/code_submit/{token}")
    Call<GxbResponse<Status>> submitVarifyCode(@Path("token") String token, @Field("code") String code);

}
