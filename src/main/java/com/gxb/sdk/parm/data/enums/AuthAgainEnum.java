package com.gxb.sdk.parm.data.enums;

/**
 * 登录成功后是否需要再次授权
 */
public enum AuthAgainEnum {
    YES("yes", "需要再次授权"),
    NO("no", "不需要再次授权"),

    ;



    private String value;

    private String message;

    private AuthAgainEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static AuthAgainEnum getByValue(String value) {
        if (value != null) {
            AuthAgainEnum[] values = values();
            for (AuthAgainEnum each : values) {
                if (each.value.equals(value)) {
                    return each;
                }
            }
        }
        return null;
    }
}
