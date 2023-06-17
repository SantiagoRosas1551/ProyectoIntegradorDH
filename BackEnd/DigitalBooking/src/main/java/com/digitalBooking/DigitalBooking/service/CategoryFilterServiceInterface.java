//package com.digitalBooking.DigitalBooking.service;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public Interface CategoryServiceInterface {
//    private Map<String, Category> categories;
//
//
//    public void addCategory(String categoryName) {
//        if (!categories.containsKey(categoryName)) {
//            Category category = new Category(categoryName);
//            categories.put(categoryName, category);
//        }
//    }
//
//    public void assignInstrumentToCategory(String categoryName, Instrument instrument) {
//        Category category = categories.get(categoryName);
//        if (category != null) {
//            category.addInstrument(instrument);
//        }
//    }
//
//    public List<Category> getAllCategories() {
//        return new ArrayList<>(categories.values());
//    }
//    public List<Instrument> filterInstrument(String instrument, String category) {
//        List<Instrument> filteredInstrument = new ArrayList<>();
//
//        if (instrument != null && category != null) {
//            Category selectedCategory = categories.get(category);
//            if (selectedCategory != null) {
//                filteredInstrument = selectedCategory.getProducts().stream()
//                        .filter(instrument -> instrument.getInstrument().equals(instrument))
//                        .collect(Collectors.toList());
//            }
//        } else if (instrument != null) {
//            filteredInstrument = categories.values().stream()
//                    .flatMap(category -> category.getInstrument().stream())
//                    .filter(instrument -> instrument.getInstrument().equals(instrument))
//                    .collect(Collectors.toList());
//        } else if (category != null) {
//            Category selectedCategory = categories.get(category);
//            if (selectedCategory != null) {
//                filteredInstrument = selectedCategory.getInstrument();
//            }
//        }
//
//        return filteredInstrument;
//    }
//
//}
