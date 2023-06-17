package com.digitalBooking.DigitalBooking.controller;


import com.digitalBooking.DigitalBooking.model.DTO.CategoryDTO;
import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
import com.digitalBooking.DigitalBooking.model.Instrument;
import com.digitalBooking.DigitalBooking.service.CategoryServiceInterface;
import com.digitalBooking.DigitalBooking.service.InstrumentServiceInterface;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/admin/categories")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryServiceInterface categoryService;
    private final InstrumentServiceInterface instrumentService;

    @PostMapping("/add")
    public ResponseEntity createCategory(@RequestBody CategoryDTO categoryDTO) {

        categoryService.createCategory(categoryDTO);

        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/showAll")

    public Set<CategoryDTO> showAll() {
        return categoryService.getAllCategories();
    }








    ///WIP
//   @PutMapping("/assign/{id}")
//
//    public ResponseEntity  assignCategory(@PathVariable Long id, CategoryDTO categoryDTO){
//
//        var i = instrumentService.showInstrument(id);
//        categoryService.assignCategory(categoryDTO,i);
//
//        return ResponseEntity.ok(HttpStatus.OK);
//   }




}
