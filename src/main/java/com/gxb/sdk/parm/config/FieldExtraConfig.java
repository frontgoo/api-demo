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
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年6月21日 下午4:27:30
 */
public class FieldExtraConfig {
    public enum FieldExtraType {
        SMS, PIC
    }

    /**
     * 字段初始化类型，PIC：刷新图片验证码；SMS：刷新随机短信验证码
     */
    private FieldExtraType fieldExtraType;

    /**
     * 短信验证码刷新间隔
     */
    private int smsInterval;

    public FieldExtraType getFieldExtraType() {
        return fieldExtraType;
    }

    public void setFieldExtraType(FieldExtraType fieldExtraType) {
        this.fieldExtraType = fieldExtraType;
    }

    public int getSmsInterval() {
        return smsInterval;
    }

    public void setSmsInterval(int smsInterval) {
        this.smsInterval = smsInterval;
    }

}
