package com.digitalBooking.DigitalBooking.service;

import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;

import java.util.Set;

public interface InstrumentServiceInterface {


    void registerInstrument(InstrumentDTO instrumentDTO);
    InstrumentDTO showInstrument(Long id);
    Set<InstrumentDTO> showAll();
    void deleteInstrument(Long id);






}
