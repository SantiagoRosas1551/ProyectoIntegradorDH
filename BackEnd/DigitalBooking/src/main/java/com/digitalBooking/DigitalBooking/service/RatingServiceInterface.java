package com.digitalBooking.DigitalBooking.service;

import java.math.BigDecimal;
import java.util.Set;
import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
import com.digitalBooking.DigitalBooking.model.DTO.RatingDTO;
import com.digitalBooking.DigitalBooking.model.Rating;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RatingServiceInterface  {



    void createRating(RatingDTO ratingDTO);
    RatingDTO showRating(Long id);
    Set<Rating> showAll();
    void deleteRating(Long id);
//    BigDecimal averageRating (Set<BigDecimal> ratings);



}
