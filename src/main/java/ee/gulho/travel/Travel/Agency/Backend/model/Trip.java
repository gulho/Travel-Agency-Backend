package ee.gulho.travel.Travel.Agency.Backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import ee.gulho.travel.Travel.Agency.Backend.util.enums.MealType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Trip implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "airport_from")
    private Airport from;
    @ManyToOne
    @JoinColumn(name = "airport_to")
    private Airport to;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    private LocalDate fromDate;
    private LocalDate toDate;
    @Enumerated
    private MealType mealType;
    private BigDecimal priceForAdult;
    private BigDecimal priceForChild;
    private Integer adultBeds;
    private Integer childBeds;
    private Boolean isPromoted;
    @OneToMany(mappedBy = "trip")
    private List<Image> images;
}
