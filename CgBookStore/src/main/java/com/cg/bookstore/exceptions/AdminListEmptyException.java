package com.cg.bookstore.exceptions;

public class AdminListEmptyException extends RuntimeException {
    public AdminListEmptyException() {
    }

    public AdminListEmptyException(String message) {
        super(message);
    }

    public AdminListEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminListEmptyException(Throwable cause) {
        super(cause);
    }

    public AdminListEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
