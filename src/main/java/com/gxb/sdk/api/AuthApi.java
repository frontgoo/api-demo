package com.gxb.sdk.api;

import com.gxb.sdk.parm.AuthRequest;
import com.gxb.sdk.parm.AuthToken;
import com.gxb.sdk.parm.GxbResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 统一认证授权接口
 */
public interface AuthApi {
    /**
     * 获取授权token
     *
     * @param req
     * @return
     */
    @POST("v2/get_auth_token")
    Call<GxbResponse<AuthToken>> auth(@Body AuthRequest req);

}
