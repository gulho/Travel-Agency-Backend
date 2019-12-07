package ee.gulho.travel.Travel.Agency.Backend.model;

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
    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;
    private String description;
}
