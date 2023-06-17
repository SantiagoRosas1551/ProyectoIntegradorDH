package com.digitalBooking.DigitalBooking.controller;


import com.digitalBooking.DigitalBooking.model.DTO.requests.AuthResponse;
import com.digitalBooking.DigitalBooking.model.DTO.requests.LoginRequest;
import com.digitalBooking.DigitalBooking.model.DTO.requests.SignUpRequest;
import com.digitalBooking.DigitalBooking.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthResponse> signin(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authenticationService.logIn(loginRequest));
    }

}