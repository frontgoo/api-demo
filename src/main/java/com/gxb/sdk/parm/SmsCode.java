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
 * 短信验证码重发结果
 *
 * @author <A HREF="mailto:wangcheng@gxb.io">Cheng Wang</A>
 * @version 1.0
 * @since 2017年7月2日 下午11:14:44
 */
public class SmsCode implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1305305092996440518L;

    /**
     * 刷新结果
     */
    private boolean result;

    /**
     * 短信验证码刷新提示
     */
    private String tips;

    /**
     * 下次短信验证码刷新间隔,unit s
     */
    private int nextInterval;


    public SmsCode() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SmsCode(boolean result, String tips, int nextInterval) {
        this.result = result;
        this.tips = tips;
        this.nextInterval = nextInterval;
    }

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

    public int getNextInterval() {
        return nextInterval;
    }

    public void setNextInterval(int nextInterval) {
        this.nextInterval = nextInterval;
    }

}
