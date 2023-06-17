package com.digitalBooking.DigitalBooking.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public record JwtConfig(@Value("${jwt.secret.key}")String secretKey,@Value("${jwt.secret.expiration.in.milliseconds}")Long expiration) {



}
