package ee.gulho.travel.Travel.Agency.Backend.model;

import ee.gulho.travel.Travel.Agency.Backend.util.enums.MealType;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "airport_from")
    private Airport from;
    @ManyToOne
    @JoinColumn(name = "airport_to")
    private Airport to;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    @Enumerated
    private MealType mealType;
    private BigDecimal price_for_adult;
    private BigDecimal price_for_child;
    private Integer adultBeds;
    private Integer childBeds;
}
