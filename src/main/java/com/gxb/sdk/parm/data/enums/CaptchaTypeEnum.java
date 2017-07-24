package com.gxb.sdk.parm.data.enums;

/**
 * 验证码类型渠道
 */
public enum CaptchaTypeEnum {
    SMS("sms", "短信验证码"),
    IMAGE("image", "图片验证码"),
    SMS_IMAGE("sms_image", "短信验证码加图片验证码"),
    NONE("none", "不需要验证码"),

    ;



    private String value;

    private String message;

    private CaptchaTypeEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static CaptchaTypeEnum getByValue(String value) {
        if (value != null) {
            CaptchaTypeEnum[] values = values();
            for (CaptchaTypeEnum each : values) {
                if (each.value.equals(value)) {
                    return each;
                }
            }
        }
        return null;
    }
}
