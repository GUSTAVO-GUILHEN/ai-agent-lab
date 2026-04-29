package com.oficina.exception;

public class DuplicateLicensePlateException extends RuntimeException {
    public DuplicateLicensePlateException(String message) {
        super(message);
    }
}
