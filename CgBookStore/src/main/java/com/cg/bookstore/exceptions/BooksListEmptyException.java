package com.cg.bookstore.exceptions;

public class BooksListEmptyException extends RuntimeException {
    public BooksListEmptyException() {
    }

    public BooksListEmptyException(String message) {
        super(message);
    }

    public BooksListEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BooksListEmptyException(Throwable cause) {
        super(cause);
    }

    public BooksListEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
