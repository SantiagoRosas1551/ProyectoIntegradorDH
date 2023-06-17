package com.digitalBooking.DigitalBooking.repository;

import com.digitalBooking.DigitalBooking.model.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepositoryInterface extends JpaRepository <Instrument, Long>{


}
