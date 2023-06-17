package com.digitalBooking.DigitalBooking.model.DTO;

import com.digitalBooking.DigitalBooking.model.Role;
import lombok.Data;

@Data
public class UserDTO {

    private Long id;
private String name;
private String lastName;
private String email;
private String password;
private Role role;


}
