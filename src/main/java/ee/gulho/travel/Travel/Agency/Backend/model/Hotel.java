package ee.gulho.travel.Travel.Agency.Backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer standard; //stars
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
