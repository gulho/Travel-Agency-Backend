package ee.gulho.travel.Travel.Agency.Backend.repository;

import ee.gulho.travel.Travel.Agency.Backend.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
