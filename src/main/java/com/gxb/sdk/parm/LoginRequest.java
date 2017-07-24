/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.parm;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月3日 下午5:53:34
 */
public class LoginRequest {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 图片验证码
     */
    private String code;
    /**
     * 随机短信验证码（运营商使用较多）
     */
    private String randomPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRandomPassword() {
        return randomPassword;
    }

    public void setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
    }


}
