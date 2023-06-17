package com.digitalBooking.DigitalBooking.model;


public class RatingCount {

    private String name;
    private double rating;
    private int ratingCount;

    public void Instrument(String name, double rating, int ratingCount) {
        this.name = name;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public double getRating() {
        return rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void calculateAverageRating() {
        if (ratingCount > 0) {
            rating = rating / ratingCount;
        }
    }
}

