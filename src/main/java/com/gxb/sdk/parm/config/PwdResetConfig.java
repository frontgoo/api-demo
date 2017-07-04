/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.parm.config;

/**
 * 密码找回配置
 * 
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月21日 下午4:55:33
 */
public class PwdResetConfig {
    /**
     * 密码重置提示：请编辑短信"MMCZ#6位新密码"发送至"10010"找回密码!
     */
    private String resetTips;


    public enum PassResetType {
        SMS, URL
    }

    /**
     * 密码重置类型，SMS：短信找回密码；URL：打开网页找回密码
     */
    private PassResetType passResetType;

    /**
     * SMS类型下，编辑的短信模板，如CZMM#{身份证号}
     */
    private String smsTemplate;
    /**
     * SMS类型下，重置密码短信的接收方，如10086
     */
    private String smsReceiver;

    /**
     * URL类型下，重置密码所打开的网页地址
     */
    private String resetURL;

    public String getResetTips() {
        return resetTips;
    }

    public void setResetTips(String resetTips) {
        this.resetTips = resetTips;
    }

    public PassResetType getPassResetType() {
        return passResetType;
    }

    public void setPassResetType(PassResetType passResetType) {
        this.passResetType = passResetType;
    }

    public String getSmsTemplate() {
        return smsTemplate;
    }

    public void setSmsTemplate(String smsTemplate) {
        this.smsTemplate = smsTemplate;
    }

    public String getSmsReceiver() {
        return smsReceiver;
    }

    public void setSmsReceiver(String smsReceiver) {
        this.smsReceiver = smsReceiver;
    }

    public String getResetURL() {
        return resetURL;
    }

    public void setResetURL(String resetURL) {
        this.resetURL = resetURL;
    }

    @Override
    public String toString() {
        return "PwdResetConfig [resetTips=" + resetTips + ", passResetType=" + passResetType + ", smsTemplate=" + smsTemplate + ", smsReceiver="
                + smsReceiver + ", resetURL=" + resetURL + "]";
    }

}
