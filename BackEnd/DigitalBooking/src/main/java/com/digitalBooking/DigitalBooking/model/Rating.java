package com.digitalBooking.DigitalBooking.model;

import com.digitalBooking.DigitalBooking.model.Instrument;
import com.digitalBooking.DigitalBooking.model.User;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Ratings")
public class Rating {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String description;
private BigDecimal rating;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;

@ManyToOne
@JoinColumn(name = "instrument_id")

private Instrument instrument;



}
