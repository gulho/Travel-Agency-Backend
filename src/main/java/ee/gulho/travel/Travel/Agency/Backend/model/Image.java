package ee.gulho.travel.Travel.Agency.Backend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fileName;
    private String fileSystemName;
    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;
}
