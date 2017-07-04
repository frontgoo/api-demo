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
 * @since 2017年6月21日 下午3:37:30
 */
public class LoginField {
    /**
     * 字段名，username
     */
    private String field;

    /**
     * 字段中文名，账号
     */
    private String fieldName;
    /**
     * 字段描述,手机号/用户名/邮箱
     */
    private String fieldDesc;

    /**
     * 字段校验正则,^.{3,}$
     */
    private String checkRegex;
    /**
     * 字段校验提示，不少于3位字符
     */
    private String fieldTips;

    /**
     * 字段额外配置，比如需要刷新图片验证码，短信验证码
     */
    private FieldExtraConfig fieldExtraConfig;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public String getCheckRegex() {
        return checkRegex;
    }

    public void setCheckRegex(String checkRegex) {
        this.checkRegex = checkRegex;
    }

    public String getFieldTips() {
        return fieldTips;
    }

    public void setFieldTips(String fieldTips) {
        this.fieldTips = fieldTips;
    }

    public FieldExtraConfig getFieldExtraConfig() {
        return fieldExtraConfig;
    }

    public void setFieldExtraConfig(FieldExtraConfig fieldExtraConfig) {
        this.fieldExtraConfig = fieldExtraConfig;
    }

}
