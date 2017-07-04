/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.parm.config;

import java.util.List;

/**
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月21日 下午2:49:47
 */
public class LoginConfig {
    /**
     * 配置所在的授权项：如 ecommerce
     */
    private String authItem;

    /**
     * 当前配置所对应的具体授权名称：如 淘宝/支付宝
     */
    private String authName;

    /**
     * 该具体授权项下对应的登录表单配置列表
     */
    private List<LoginForm> loginForms;

    /**
     * 最近一次配置更新时间
     */
    private long lastUpdatedAt;

    public String getAuthItem() {
        return authItem;
    }

    public void setAuthItem(String authItem) {
        this.authItem = authItem;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public List<LoginForm> getLoginForms() {
        return loginForms;
    }

    public void setLoginForms(List<LoginForm> loginForms) {
        this.loginForms = loginForms;
    }

    public long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

}
