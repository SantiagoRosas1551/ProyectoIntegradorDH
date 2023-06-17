package com.digitalBooking.DigitalBooking.security.jwt.impl;

import com.digitalBooking.DigitalBooking.security.jwt.JwtConfig;
import com.digitalBooking.DigitalBooking.security.jwt.JwtService;
import com.digitalBooking.DigitalBooking.security.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.util.Date;


@Service
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService {


    private final JwtUtil jwtUtil;
    private final JwtConfig config;
    private final Clock clock;



    @Override
    public String extractUserName(String token) {
        return jwtUtil.extractUserName(token,config.secretKey());
    }

    @Override
    public String generateToken(UserDetails userDetails) {
       return jwtUtil.generateToken(userDetails, clock.millis(), config.expiration(),config.secretKey());
    }

//    @Override
//    public boolean isTokenValid(String token, UserDetails userDetails) {
//        return false;
//    }

    @Override
    public boolean isTokenValid(String token, UserDetails userDetails, String username) {
        return (username.equals(userDetails.getUsername()))&& !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return jwtUtil.extractExpiration(token, config.secretKey()).before(new Date(clock.millis()));
    }

}






































