//package com.digitalBooking.DigitalBooking.service;
//
//import com.digitalBooking.DigitalBooking.model.DTO.BrandDTO;
//import com.digitalBooking.DigitalBooking.model.DTO.CategoryDTO;
//import com.digitalBooking.DigitalBooking.model.DTO.ImageDTO;
//import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
//import com.digitalBooking.DigitalBooking.repository.InstrumentRepositoryInterface;
//import com.digitalBooking.DigitalBooking.service.impl.InstrumentService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Spy;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@ExtendWith(MockitoExtension.class)
//@SpringBootTest
//class InstrumentServiceTest {
//
//    @InjectMocks
//    InstrumentService instrumentService;
//    @Mock
//    InstrumentRepositoryInterface instrumentRepository;
//    @Spy
//    ObjectMapper mapper;
//
//    @Test
//    void registerInstrument() {
//
//        BrandDTO brand1 = new BrandDTO("Stradivarius","3/4");
//        CategoryDTO category1 = new CategoryDTO("Instrumento de cuerda");
//        ImageDTO image1 = new ImageDTO("https://http2.mlstatic.com/D_NQ_NP_917199-MLA40302105243_012020-O.webp");
//        Set <ImageDTO> images1 = new HashSet<>();
//
//        images1.add(image1);
//        InstrumentDTO instrumento1 = new InstrumentDTO("Violin","Es un violin ideal para principiantes",brand1,images1, BigDecimal.valueOf(2000.00),category1);
//
//        instrumentService.registerInstrument(instrumento1);
//
//
//
//        assertNotNull(instrumento1);
//    }
//}




