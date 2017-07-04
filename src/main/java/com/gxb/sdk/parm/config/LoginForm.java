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
 * @since 2017年6月21日 下午3:33:24
 */
public class LoginForm {
    /**
     * 登录方式表单名称，账户密码授权/二维码授权/手机号授权
     */
    private String formName;

    public enum Status {
        NORMAL, MAINTAINED, OFFLINE
    }

    /**
     * 当前登录方式的状态 NORMAL:正常服务 MAINTAINED：正在维护 OFFLINE：当前方式已下线
     */
    private Status status;


    public enum LoginFormType {
        QR, NORMAL
    }

    /**
     * 授权方式，QR:二维码授权模式；NORMAL：普通按字段列表授权模式
     */
    private LoginFormType loginFormType;

    /**
     * NORMAL：普通按字段列表授权模式下具体的授权所需要的字段列表；QR模式下不需要展示
     */
    private List<LoginField> fields;
    /**
     * 找回用户名地址
     */
    private String retrieveUserNameUrl;

    /**
     * 密码重置配置
     */
    private PwdResetConfig pwdResetConfig;

    /**
     * 账号注册地址
     */
    private String registerUrl;
    /**
     * 登录帮助信息地址
     */
    private String helpUrl;

    /**
     * 登录提示信息
     */
    private String loginTips;


    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LoginFormType getLoginFormType() {
        return loginFormType;
    }

    public void setLoginFormType(LoginFormType loginFormType) {
        this.loginFormType = loginFormType;
    }

    public List<LoginField> getFields() {
        return fields;
    }

    public void setFields(List<LoginField> fields) {
        this.fields = fields;
    }

    public String getRetrieveUserNameUrl() {
        return retrieveUserNameUrl;
    }

    public void setRetrieveUserNameUrl(String retrieveUserNameUrl) {
        this.retrieveUserNameUrl = retrieveUserNameUrl;
    }

    public PwdResetConfig getPwdResetConfig() {
        return pwdResetConfig;
    }

    public void setPwdResetConfig(PwdResetConfig pwdResetConfig) {
        this.pwdResetConfig = pwdResetConfig;
    }

    public String getRegisterUrl() {
        return registerUrl;
    }

    public void setRegisterUrl(String registerUrl) {
        this.registerUrl = registerUrl;
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public void setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
    }

    public String getLoginTips() {
        return loginTips;
    }

    public void setLoginTips(String loginTips) {
        this.loginTips = loginTips;
    }

}
