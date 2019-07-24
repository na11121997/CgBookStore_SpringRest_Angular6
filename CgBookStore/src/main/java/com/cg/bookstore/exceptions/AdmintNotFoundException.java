package com.cg.bookstore.exceptions;

public class AdmintNotFoundException extends RuntimeException {
    public AdmintNotFoundException() {
    }

    public AdmintNotFoundException(String message) {
        super(message);
    }

    public AdmintNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdmintNotFoundException(Throwable cause) {
        super(cause);
    }

    public AdmintNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
