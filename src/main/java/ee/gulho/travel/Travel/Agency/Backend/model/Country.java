package ee.gulho.travel.Travel.Agency.Backend.model;

import ee.gulho.travel.Travel.Agency.Backend.util.enums.Continent;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Country {
    @Id
    @Column(unique = true, nullable = false)
    private String countryCode;
    @Column(nullable = false)
    private String name;
    @Enumerated
    private Continent continent;
    private String description;
}
