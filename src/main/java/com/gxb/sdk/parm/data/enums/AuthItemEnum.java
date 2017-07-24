package com.gxb.sdk.parm.data.enums;

/**
 * V1版本API支持的授权项
 */
public enum AuthItemEnum {
	JD("jd", "京东授权"),
    XUEXIN("xuexin", "学信网授权"),
    CREDIT("credit", "人行征信报告"),
    SECURITY("security", "社保授权"),
    RESUME("resume", "简历授权"),
    ;



	private String value;
    private String message;

    private AuthItemEnum(String value, String message) {
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
    

    public static AuthItemEnum parse(String value) {
        if (value != null) {
            AuthItemEnum[] values = values();
            for (AuthItemEnum each : values) {
                if (each.value.equals(value)) {
                    return each;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public boolean isEqual(String authItem) {
        return this.value.equals(authItem);
    }

}
