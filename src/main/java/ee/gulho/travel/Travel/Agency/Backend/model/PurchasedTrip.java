package ee.gulho.travel.Travel.Agency.Backend.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class PurchasedTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Users customer;
    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;
    private BigDecimal amount;
}
