package com.mefrreex.yookassa.exception;

public class YookassaRequestException extends RuntimeException {

    public YookassaRequestException(String message) {
        super(message);
    }

    public YookassaRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
