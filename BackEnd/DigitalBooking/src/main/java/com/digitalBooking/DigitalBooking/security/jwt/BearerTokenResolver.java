package com.digitalBooking.DigitalBooking.security.jwt;

import jakarta.servlet.http.HttpServletRequest;

public interface BearerTokenResolver {

    String resolve(HttpServletRequest request);
}

