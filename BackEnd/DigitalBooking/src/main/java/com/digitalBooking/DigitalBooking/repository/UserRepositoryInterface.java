package com.digitalBooking.DigitalBooking.repository;

import com.digitalBooking.DigitalBooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//@Transactional
public interface UserRepositoryInterface extends JpaRepository <User, Long> {



Optional<User> findByEmail(String email);



}
