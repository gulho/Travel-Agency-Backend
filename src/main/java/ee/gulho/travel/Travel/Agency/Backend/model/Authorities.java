package ee.gulho.travel.Travel.Agency.Backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data
public class Authorities implements Serializable {
    @ManyToOne
    @JoinColumn(name = "username")
    @Id
    private Users user;
    @Id
    private String authority;
}
