package com.gxb.sdk.parm.data.enums;

/**
 * 是否需要再次获取授权参数项
 */
public enum ArgumentsAgainEnum {
    YES("yes", "需要再次获取授权参数项"),
    NO("no", "不需要再次获取授权参数项"),;


    private String value;

    private String message;

    private ArgumentsAgainEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static ArgumentsAgainEnum getByValue(String value) {
        if (value != null) {
            ArgumentsAgainEnum[] values = values();
            for (ArgumentsAgainEnum each : values) {
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
