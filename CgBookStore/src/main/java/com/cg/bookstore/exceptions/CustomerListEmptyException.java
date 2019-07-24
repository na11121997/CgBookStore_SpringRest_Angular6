package com.cg.bookstore.exceptions;

public class CustomerListEmptyException extends RuntimeException {
    public CustomerListEmptyException() {
    }

    public CustomerListEmptyException(String message) {
        super(message);
    }

    public CustomerListEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerListEmptyException(Throwable cause) {
        super(cause);
    }

    public CustomerListEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
