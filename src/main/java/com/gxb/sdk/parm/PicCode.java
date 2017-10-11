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
 * 图片验证码刷新结果
 *
 * 
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月2日 下午11:14:44
 */
public class PicCode implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8959023731236850895L;

    /**
     * 刷新结果
     */
    private boolean result;

    /**
     * 图片验证码刷新提示
     */
    private String tips;


    /**
     * 图片验证码的64内容
     */
    private String base64;


    public boolean isResult() {
        return result;
    }


    public void setResult(boolean result) {
        this.result = result;
    }


    public String getTips() {
        return tips;
    }


    public void setTips(String tips) {
        this.tips = tips;
    }


    public String getBase64() {
        return base64;
    }


    public void setBase64(String base64) {
        this.base64 = base64;
    }


}
