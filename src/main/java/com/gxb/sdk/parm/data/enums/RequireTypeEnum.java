package com.gxb.sdk.parm.data.enums;

/**
 * 是否必填
 */
public enum RequireTypeEnum {
	OPTIONAL("optional", "非必填"),
    REQUIRED("required", "必填"),

    ;



    private String value;

    private String message;

    private RequireTypeEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static RequireTypeEnum getByValue(String value) {
        if (value != null) {
            RequireTypeEnum[] values = values();
            for (RequireTypeEnum each : values) {
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
