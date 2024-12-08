package com.mefrreex.yookassa.exception;

public class YookassaClientException extends RuntimeException {

    public YookassaClientException(String message) {
        super(message);
    }

    public YookassaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
