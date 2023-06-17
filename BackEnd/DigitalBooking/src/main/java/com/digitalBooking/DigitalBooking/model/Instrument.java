package com.digitalBooking.DigitalBooking.model;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import com.digitalBooking.DigitalBooking.model.Rating;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Generamos las tablas a través de Hibernate y JPA. */

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id", scope = Instrument.class)
@Getter
@Setter
@Entity
@Table(name = "Instruments")
@AllArgsConstructor
@NoArgsConstructor
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Set<String> features;

    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "brand_id")
//    @JsonManagedReference("instruments-brand")
    private Brand brand;

    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.PERSIST)

    @JoinColumn(name = "category_id")
//    @JsonManagedReference(value = "instruments-category")
    private Category category;

    @OneToMany(mappedBy = "instrument", cascade = CascadeType.ALL)
    private Set<Image> images;

    @OneToMany(mappedBy = "instrument")
    private Set<Rating> ratings;

    private BigDecimal pricePerDay;


    public void setCategory(Category category) {
        this.category = category;
    }
}



