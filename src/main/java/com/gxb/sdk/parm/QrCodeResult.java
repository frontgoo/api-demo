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
 * @since 2017年7月2日 下午11:14:44
 */
public class QrCodeResult {
    /**
     * 二维码图片地址
     */
    private String httpQRCode;
    /**
     * 用于手机rpc唤起本地app的链接,接入的app要实现相应功能需要做额外设置。 不同网站对rpcQRCode处理略有不同，需要配合不同的引导
     * 参看https://doc.gxb.io/dcdoc/jie-ru-fang-shi/h5jie-ru-fang-shi.html
     */
    private String rpcQRCode;

    /**
     * 二维码对应的网站，方便接入方在二维码中间加入对应的网站icon。如：alipay.com/taobao.com/wx.qq.com
     */
    private String website;

    public String getHttpQRCode() {
        return httpQRCode;
    }

    public void setHttpQRCode(String httpQRCode) {
        this.httpQRCode = httpQRCode;
    }

    public String getRpcQRCode() {
        return rpcQRCode;
    }

    public void setRpcQRCode(String rpcQRCode) {
        this.rpcQRCode = rpcQRCode;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
