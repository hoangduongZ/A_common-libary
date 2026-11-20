package com.lab.common.exception;

public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final int statusCode;
    private final String errorCode;

    public ApiException(String message) {
        super(message);
        this.statusCode = 500;
        this.errorCode = "INTERNAL_SERVER_ERROR";
    }

    public ApiException(int statusCode, String errorCode, String message) {
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }

    public ApiException(int statusCode, String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
