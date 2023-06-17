package com.digitalBooking.DigitalBooking.model.DTO.requests;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRequest {



    @NotEmpty(message = "E-mail cannot be blank")
    @Length(min =10 ,max = 50)
    private String email;

    @NotEmpty(message = "Password is required")
    @Length(min = 8,max = 50)
    private String password;

}
