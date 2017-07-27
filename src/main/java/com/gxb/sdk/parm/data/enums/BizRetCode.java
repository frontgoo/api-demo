package com.gxb.sdk.parm.data.enums;

/**
 * 结果码
 */
public enum BizRetCode {
	SUCCESS(1, "成功"),
	FAILED(2, "失败"),

	;



	private int code;
	private String description;

	private BizRetCode(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}

	/**
	 * 根据值获取对应的枚举
	 * @param value 枚举的数值
	 * @return 成功返回相应的枚举，否则返回null。
	 */
	public static BizRetCode parse(Integer value) {
		if (value != null) {
			BizRetCode[] array = values();
			for (BizRetCode each : array) {
				if (value == each.code) {
					return each;
				}
			}
		}
		return null;
	}
}
