//package com.digitalBooking.DigitalBooking.service.impl;
//
//import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
//import com.digitalBooking.DigitalBooking.model.DTO.RatingDTO;
//import com.digitalBooking.DigitalBooking.model.Rating;
//import com.digitalBooking.DigitalBooking.repository.InstrumentRatingRepository;
//import com.digitalBooking.DigitalBooking.service.RatingServiceInterface;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.Iterator;
//import java.util.OptionalDouble;
//import java.util.Set;
//import java.util.stream.Stream;
//
//@Service
//@AllArgsConstructor
//public class RatingServiceImpl implements RatingServiceInterface {
//
//private final InstrumentRatingRepository instrumentRatingRepository;
//
//
//    private final ObjectMapper mapper;
//
//
//    @Override
//    public void createRating(RatingDTO ratingDTO) {
//
//
//        Rating rating = mapper.convertValue(ratingDTO, Rating.class);
//
//
//        instrumentRatingRepository.save(rating);
//    }
//
//
//    @Override
//    public RatingDTO showRating(Long id) {
//        return null;
//    }
//
//    @Override
//    public Set<Rating> showAll() {
//        return null;
//    }
//
//    @Override
//    public void deleteRating(Long id) {
//
//    }
//
////    @Override
////    public BigDecimal averageRating(Set<BigDecimal> ratings) {
////
////        BigDecimal sum = BigDecimal.ZERO;
////
////        for (BigDecimal rating: ratings){
////            sum = sum.add(rating);
////        }
////
////  return sum.divide(new BigDecimal(ratings.size()));
////    }
//
//
//
//
//}
