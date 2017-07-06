/**
 * This document and its contents are protected by copyright 2017 and owned by gxb.io Inc. The
 * copying and reproduction of this document and/or its content (whether wholly or partly) or any
 * incorporation of the same into any other material in any media or format of any kind is strictly
 * prohibited. All rights are reserved.
 *
 * Copyright (c) gxb.io Inc. 2017
 */
package com.gxb.sdk.parm;

import java.io.Serializable;

/**
 * 额外信息，动态属性集合，根据业务不同可能额外增加其他属性
 * 
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月2日 下午11:19:00
 */
public class Extra implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -5899591305571266458L;
    /**
     * 弹窗引导title，有则需要显示。如：短信验证码
     */
    private String title;
    /**
     * 弹窗的引导文本。如:请输入您收到的阿里巴巴登录验证码
     */
    private String tips;
    /**
     * 状态为失败为LOGIN_FAILED，FAILED时给出相应的提示信息。如：用户名密码错误
     * 状态为失败为REFRESH_IMAGE_SUCCESS时，是图片验证码的base64
     * 
     */
    private String remark;
    /**
     * 二维码初始化信息
     */
    private QrCode qrCode;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public QrCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(QrCode qrCode) {
        this.qrCode = qrCode;
    }

}
