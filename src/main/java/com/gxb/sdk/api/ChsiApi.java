package com.gxb.sdk.api;

import com.gxb.sdk.parm.GxbResponse;
import com.gxb.sdk.parm.LoginRequest;
import com.gxb.sdk.parm.Status;
import com.gxb.sdk.parm.config.LoginConfig;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * 学信网API
 */
public interface ChsiApi {
    /**
     * 获取学信网登录配置
     *
     * @param token 用户的授权token
     * @return
     */
    @GET("minterm/v2/init_config/chsi/{token}")
    Call<GxbResponse<LoginConfig>> getChsiInitConf(@Path("token") String token);

    /**
     * 获取学信任务的当前状态
     * 
     * @param token
     * @return
     */
    @GET("minterm/v2/get_status/{token}")
    Call<GxbResponse<Status>> getStatus(@Path("token") String token);

    /**
     * 刷新学信登录的登录图片验证码
     * 
     * @param token
     * @return
     */
    @GET("minterm/v2/refresh_verify_code/{token}")
    Call<GxbResponse<Status>> refreshLoginPicCode(@Path("token") String token);

    /**
     * 登录提交接口，提交后就要开始轮训后台状态，直到登录成功或失败
     * 
     * @param token
     * @return
     */
    @POST("minterm/v2/login_submit/{token}")
    Call<GxbResponse<Status>> submitLogin(@Path("token") String token, @Body LoginRequest loginInfo);

}
