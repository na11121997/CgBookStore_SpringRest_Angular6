package com.cg.bookstore.exceptions;

public class OrderListEmptyException extends RuntimeException{
    public OrderListEmptyException() {
    }

    public OrderListEmptyException(String message) {
        super(message);
    }

    public OrderListEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderListEmptyException(Throwable cause) {
        super(cause);
    }

    public OrderListEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
