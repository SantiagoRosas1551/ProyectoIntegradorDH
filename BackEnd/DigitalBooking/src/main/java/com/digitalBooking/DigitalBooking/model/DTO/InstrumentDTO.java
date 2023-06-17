package com.digitalBooking.DigitalBooking.model.DTO;

import com.digitalBooking.DigitalBooking.model.Category;
import com.digitalBooking.DigitalBooking.model.DTO.BrandDTO;
import com.digitalBooking.DigitalBooking.model.Image;
import com.digitalBooking.DigitalBooking.model.Instrument;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstrumentDTO {

    private Long id;
    private String name;
    private String description;
    private BrandDTO brand;
    private Set<ImageDTO> images;
    private BigDecimal pricePerDay;
    private CategoryDTO category;
    private Set<String> features;

}
