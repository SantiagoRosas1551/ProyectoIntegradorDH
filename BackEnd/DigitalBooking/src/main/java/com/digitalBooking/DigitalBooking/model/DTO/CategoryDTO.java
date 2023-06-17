package com.digitalBooking.DigitalBooking.model.DTO;

import com.digitalBooking.DigitalBooking.model.Image;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    private Long id;
    private String categoryName;
    private Set<ImageDTO> images;

}
