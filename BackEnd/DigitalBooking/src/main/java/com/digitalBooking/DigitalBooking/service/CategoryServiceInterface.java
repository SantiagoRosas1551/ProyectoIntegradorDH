package com.digitalBooking.DigitalBooking.service;

import com.digitalBooking.DigitalBooking.model.Category;
import com.digitalBooking.DigitalBooking.model.DTO.CategoryDTO;
import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
import com.digitalBooking.DigitalBooking.model.Instrument;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface CategoryServiceInterface {

void createCategory(CategoryDTO categoryDTO);
Instrument assignCategory(CategoryDTO categoryDTO, InstrumentDTO instrumentDTO);
CategoryDTO getCategory(Long id);
void deleteCategory(Long id);
Set<CategoryDTO> getAllCategories();

}
