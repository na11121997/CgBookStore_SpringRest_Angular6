package com.cg.bookstore.exceptions;

public class CategoryListIsEmptyException extends RuntimeException {
    public CategoryListIsEmptyException() {
    }

    public CategoryListIsEmptyException(String message) {
        super(message);
    }

    public CategoryListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CategoryListIsEmptyException(Throwable cause) {
        super(cause);
    }

    public CategoryListIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
