package com.digitalBooking.DigitalBooking.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@Builder

public class RatingDTO {
    private Long id;
    private String description;
    private BigDecimal rating;


}
