package com.gxb.sdk.api;

import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.Status;
import com.gxb.sdk.parm.config.LoginConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 电商API
 */
public interface WechatApi {
    /**
     * 根据用户的所在地区获取初始化微信配置，gxb讲根据定位信息使用用户附近的ip进行抓取任务，减少异地登录提醒,提升交互体验
     * 
     * ps:经纬度取不到或者不传并不会明显影响抓取成功率
     * 
     * @param token 用户的授权token
     * @param longitude 用户手机所在的定位经度
     * @param latitude 用户手机所在的定位维度
     * @return
     */
    @GET("wechat/v2/init_config/{token}")
    Call<GxbResponse<LoginConfig>> getInitConf(@Path("token") String token, @Query("longitude") String longitude, @Query("latitude") String latitude);


    /**
     * 获取微信任务的当前状态
     * 
     * @param token
     * @return
     */
    @GET("wechat/v2/get_status/{token}")
    Call<GxbResponse<Status>> getStatus(@Path("token") String token);

    /**
     * 刷新微信登录的二维码
     * 
     * @param token
     * @return
     */
    @GET("wechat/v2/refresh_qr_code/{token}")
    Call<GxbResponse<Status>> refreshLoginQrCode(@Path("token") String token);

}
