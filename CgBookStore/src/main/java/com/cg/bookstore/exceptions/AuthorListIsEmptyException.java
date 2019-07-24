package com.cg.bookstore.exceptions;

public class AuthorListIsEmptyException extends RuntimeException {
    public AuthorListIsEmptyException() {
    }

    public AuthorListIsEmptyException(String message) {
        super(message);
    }

    public AuthorListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorListIsEmptyException(Throwable cause) {
        super(cause);
    }

    public AuthorListIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
