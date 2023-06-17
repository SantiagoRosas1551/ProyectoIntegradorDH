package com.digitalBooking.DigitalBooking.service.impl;

import com.digitalBooking.DigitalBooking.model.Category;
import com.digitalBooking.DigitalBooking.model.DTO.CategoryDTO;
import com.digitalBooking.DigitalBooking.model.DTO.InstrumentDTO;
import com.digitalBooking.DigitalBooking.model.Instrument;
import com.digitalBooking.DigitalBooking.repository.CategoryRepository;
import com.digitalBooking.DigitalBooking.repository.InstrumentRepositoryInterface;
import com.digitalBooking.DigitalBooking.service.CategoryServiceInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryServiceInterface {


    private final CategoryRepository categoryRepository;
    private final ObjectMapper mapper;
    private final InstrumentService instrumentService;
    private final InstrumentRepositoryInterface instrumentRepository;


    @Override
    public void createCategory(CategoryDTO categoryDTO) {

       var category = mapper.convertValue(categoryDTO, Category.class);

     category.getImages().forEach(image -> image.setCategory(category));

        categoryRepository.save(category);
    }

    @Override
    public Instrument assignCategory(CategoryDTO categoryDTO, InstrumentDTO instrumentDTO) {

        Instrument instrument = mapper.convertValue(instrumentDTO, Instrument.class);
        Category category = mapper.convertValue(categoryDTO, Category.class);


        instrument.setCategory(category);

        return instrumentRepository.save(instrument);
    }

    @Override
    public CategoryDTO getCategory(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        CategoryDTO categoryDTO = null;
        if (category.isPresent())
            categoryDTO = mapper.convertValue(category, CategoryDTO.class);
        return categoryDTO;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Set<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();

        Set<CategoryDTO> categoriesDTO = new HashSet<>();

        for (Category category : categories) {
            categoriesDTO.add(mapper.convertValue(category, CategoryDTO.class));
        }

        return categoriesDTO;

    }
}

