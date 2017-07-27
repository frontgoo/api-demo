package com.gxb.sdk.parm.data.enums;

/**
 * 登录是否完成
 */
public enum LoginProcessEnum {
    SUCCESS("success", "登录成功"),
    PROCESSING("processing", "登录过程进行中"),

    ;



    private String value;

    private String message;

    private LoginProcessEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static LoginProcessEnum getByValue(String value) {
        if (value != null) {
            LoginProcessEnum[] values = values();
            for (LoginProcessEnum each : values) {
                if (each.value.equals(value)) {
                    return each;
                }
            }
        }
        return null;
    }
}
