package com.digitalBooking.DigitalBooking.security.jwt.exceptions;

public class BearerTokenException extends RuntimeException {
    public BearerTokenException(String message) {
        super(message);
    }
}
