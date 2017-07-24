package com.gxb.sdk.parm.data.enums;

/**
 * 授权参数配置类型
 */
public enum ArgumentTypeEnum {
    USERNAME("username", "用户名"),
    TEXT("text", "文本"),
    PASSWORD("password", "密码"),
    SMS_CODE("sms_code", "短信验证码"),
    IMAGE_CODE("image_code", "图片验证码"),
    OPTIONS("options", "选项"),
    ;



    private String value;

    private String message;

    private ArgumentTypeEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static ArgumentTypeEnum getByValue(String value) {
        if (value != null) {
            ArgumentTypeEnum[] values = values();
            for (ArgumentTypeEnum each : values) {
                if (each.value.equals(value)) {
                    return each;
                }
            }
        }
        return null;
    }

    public boolean isEqual(String argumentType) {
        return this.value.equals(argumentType);
    }
}
