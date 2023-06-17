package com.digitalBooking.DigitalBooking.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;


@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
@Table (name = "Images")
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageURL;
    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.PERSIST)

    @JoinColumn(name = "instrument_id" )
    private Instrument instrument;
    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.ALL)

    @JoinColumn(name = "category_id")
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
