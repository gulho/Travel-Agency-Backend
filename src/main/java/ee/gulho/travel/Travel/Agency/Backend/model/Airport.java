package ee.gulho.travel.Travel.Agency.Backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Airport {
    @Id
    private String code;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
