package com.gxb.sdk.parm.data.vo;


import com.gxb.sdk.parm.data.base.DataObjectBase;

/**
 * 登陆验证码.
 */
public class CaptchaVo extends DataObjectBase {
    //验证码类型
    private String captchaType;//CaptchaTypeEnum
    //图片base64
    private String imageData;
    //图片地址
    private String imageUrl;

    public String getCaptchaType() {
        return captchaType;
    }

    public void setCaptchaType(String captchaType) {
        this.captchaType = captchaType;
    }

    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
