package com.gxb.sdk.exception;

public class GxbApiException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 4773709921313688818L;

    public GxbApiException(String errorMessage) {
        super(errorMessage);
    }

    public GxbApiException(int errorCode, String errorMessage, String detail) {
        super(String.format("%s,detail:%s", errorMessage, detail));
    }

}
