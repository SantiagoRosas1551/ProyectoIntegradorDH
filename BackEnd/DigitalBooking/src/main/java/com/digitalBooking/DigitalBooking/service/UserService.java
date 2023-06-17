package com.digitalBooking.DigitalBooking.service;

import com.digitalBooking.DigitalBooking.model.DTO.requests.SignUpRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {

    UserDetails registerUser(SignUpRequest signUpRequest);



}
