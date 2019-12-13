package ee.gulho.travel.Travel.Agency.Backend.repository;

import ee.gulho.travel.Travel.Agency.Backend.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, String> {
}
