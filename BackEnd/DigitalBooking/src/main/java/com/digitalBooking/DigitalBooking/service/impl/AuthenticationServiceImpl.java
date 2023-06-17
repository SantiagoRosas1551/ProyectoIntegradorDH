package com.digitalBooking.DigitalBooking.service.impl;

import com.digitalBooking.DigitalBooking.model.DTO.requests.AuthResponse;
import com.digitalBooking.DigitalBooking.model.DTO.requests.LoginRequest;
import com.digitalBooking.DigitalBooking.model.DTO.requests.SignUpRequest;
import com.digitalBooking.DigitalBooking.model.Role;
import com.digitalBooking.DigitalBooking.model.User;
import com.digitalBooking.DigitalBooking.repository.UserRepositoryInterface;
import com.digitalBooking.DigitalBooking.security.jwt.JwtService;
import com.digitalBooking.DigitalBooking.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl  implements AuthenticationService {

    private final UserRepositoryInterface userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthResponse logIn(LoginRequest loginRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        var user = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password. Try again"));
        var jwt = jwtService.generateToken(user);
        return AuthResponse.builder().token(jwt).build();
    }

    @Override
    public AuthResponse signUp(SignUpRequest signUpRequest) {
        var user = User.builder().name(signUpRequest.getName()).lastName(signUpRequest.getLastName())
                .email(signUpRequest.getEmail()).password(passwordEncoder.encode(signUpRequest.getPassword()))
                .role(Role.USER).build();
        userRepository.save(user);
        var jwt = jwtService.generateToken(user);
        return AuthResponse.builder().token(jwt).build();

    }


}
