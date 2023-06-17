package com.digitalBooking.DigitalBooking.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name = "Booking")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date bookingDate;
    private String bookingAdress;
    @ManyToOne

    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne

    @JoinColumn(name = "instrument_id")
    private Instrument instrument;


}
