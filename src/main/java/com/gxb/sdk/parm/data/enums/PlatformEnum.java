package com.gxb.sdk.parm.data.enums;

/**
 * 平台枚举
 */
public enum PlatformEnum {
    PC("pc", "电脑版"),
    H5("h5", "移动版"),
    ANDROID("android", "安卓"),
    IOS("ios", "苹果"),

    ;



    private String value;

    private String message;

    private PlatformEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }


    public static PlatformEnum getByValue(String value) {
        if (value != null) {
            PlatformEnum[] values = values();
            for (PlatformEnum each : values) {
                if (each.value.equals(value)) {
                    return each;
                }
            }
        }
        return null;
    }
}
