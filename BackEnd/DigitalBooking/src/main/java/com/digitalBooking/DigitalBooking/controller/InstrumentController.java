package com.digitalBooking.DigitalBooking.controller;
import com.digitalBooking.DigitalBooking.model.Instrument;


import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
//import com.digitalBooking.DigitalBooking.repository.InstrumentRatingRepository;
import com.digitalBooking.DigitalBooking.service.InstrumentServiceInterface;
import com.digitalBooking.DigitalBooking.service.impl.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/instruments")
public class InstrumentController {



    @Autowired
    InstrumentServiceInterface instrumentService;
//    InstrumentRatingRepository ratingRepository;



    @PostMapping("/add")
    public ResponseEntity<?> registerInstrument(@RequestBody InstrumentDTO instrumentDTO){
        instrumentService.registerInstrument(instrumentDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public InstrumentDTO getInstrumentById(@PathVariable Long id){
        return  instrumentService.showInstrument(id);
    }

    @GetMapping("/showAll")

    public Set<InstrumentDTO>  showAll(){
        return instrumentService.showAll();
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        instrumentService.deleteInstrument(id);
    }


//    @GetMapping("/{instrumentId}/average-rating")
//    public ResponseEntity<Double> getAverageRating(@PathVariable Long instrumentId) {
//        Double averageRating = ratingRepository.getAverageRatingByInstrumentId(instrumentId);
//        if (averageRating == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(averageRating);
//    }


}