package com.digitalBooking.DigitalBooking.service;

import com.digitalBooking.DigitalBooking.model.DTO.requests.AuthResponse;
import com.digitalBooking.DigitalBooking.model.DTO.requests.LoginRequest;
import com.digitalBooking.DigitalBooking.model.DTO.requests.SignUpRequest;

public interface AuthenticationService {


    AuthResponse logIn(LoginRequest loginRequest);
    AuthResponse signUp(SignUpRequest signUpRequest);
}
