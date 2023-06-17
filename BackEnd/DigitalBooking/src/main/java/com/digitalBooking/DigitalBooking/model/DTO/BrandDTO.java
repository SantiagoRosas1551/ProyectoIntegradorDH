package com.digitalBooking.DigitalBooking.model.DTO;


import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class BrandDTO {

    private Long id;
    private String brandName;
    private String model;

}
