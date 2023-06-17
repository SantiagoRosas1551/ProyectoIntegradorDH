//package com.digitalBooking.DigitalBooking.repository;
//
//import com.digitalBooking.DigitalBooking.model.Rating;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface InstrumentRatingRepository extends JpaRepository<Rating, Long> {
//    @Query("SELECT AVG(r.rating) FROM Ratings r WHERE r.instrument.id = :\"instrument_id\"")
//    Double getAverageRatingByInstrumentId(@Param("instrumentId") Long instrumentId);
//}
