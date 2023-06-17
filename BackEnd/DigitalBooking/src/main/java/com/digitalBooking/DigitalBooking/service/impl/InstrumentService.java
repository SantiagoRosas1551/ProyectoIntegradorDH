package com.digitalBooking.DigitalBooking.service.impl;

import com.digitalBooking.DigitalBooking.model.DTO.RatingDTO;
import com.digitalBooking.DigitalBooking.model.Instrument;
import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
import com.digitalBooking.DigitalBooking.model.Rating;
import com.digitalBooking.DigitalBooking.model.RatingCount;
import com.digitalBooking.DigitalBooking.repository.InstrumentRepositoryInterface;
import com.digitalBooking.DigitalBooking.service.InstrumentServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class InstrumentService implements InstrumentServiceInterface {

  /*Inyección de dependencias por constructor*/

    private final InstrumentRepositoryInterface instrumentRepository;

    private final  ObjectMapper mapper;



    @Override
    public void registerInstrument(InstrumentDTO instrumentDTO) {
        Instrument instrument = mapper.convertValue(instrumentDTO, Instrument.class);
        instrument.getImages().forEach(instrumentImage -> instrumentImage.setInstrument(instrument));

        instrumentRepository.save(instrument);


    }

    @Override
    public InstrumentDTO showInstrument(Long id) {
        Optional<Instrument> instrument = instrumentRepository.findById(id);
        InstrumentDTO instrumentDTO = null;
        if (instrument.isPresent())
            instrumentDTO = mapper.convertValue(instrument, InstrumentDTO.class);
        return instrumentDTO;
    }

    @Override

    public Set<InstrumentDTO> showAll() {
        List<Instrument> instruments = instrumentRepository.findAll();

        Set<InstrumentDTO> instrumentsDTO = new HashSet<>();

        for (Instrument instrument : instruments){
            instrumentsDTO.add(mapper.convertValue(instrument, InstrumentDTO.class));
        }

        return instrumentsDTO;
    }

    @Override
    public void deleteInstrument(Long id) {
        instrumentRepository.deleteById(id);

    }

//    public void rateInstrument( RatingDTO ratingDTO, Long id){
//
//        Optional<Instrument> instrument = instrumentRepository.findById(id);
//        Rating rating = mapper.convertValue(ratingDTO, Rating.class);
//
//
//
//    }


}
