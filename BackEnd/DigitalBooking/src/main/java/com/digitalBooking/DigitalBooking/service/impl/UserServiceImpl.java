package com.digitalBooking.DigitalBooking.service.impl;

import com.digitalBooking.DigitalBooking.model.DTO.requests.SignUpRequest;
import com.digitalBooking.DigitalBooking.repository.UserRepositoryInterface;
import com.digitalBooking.DigitalBooking.service.UserService;
import jakarta.persistence.SequenceGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepositoryInterface userRepository;

    @Override
    public UserDetails registerUser(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        return userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
