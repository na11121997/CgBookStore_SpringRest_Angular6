package com.cg.bookstore.exceptions;

public class CommentListEmptExceptions extends RuntimeException {
    public CommentListEmptExceptions() {
    }

    public CommentListEmptExceptions(String message) {
        super(message);
    }

    public CommentListEmptExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CommentListEmptExceptions(Throwable cause) {
        super(cause);
    }

    public CommentListEmptExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
