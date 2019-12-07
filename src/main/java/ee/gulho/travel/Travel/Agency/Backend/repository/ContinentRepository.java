package ee.gulho.travel.Travel.Agency.Backend.repository;

import ee.gulho.travel.Travel.Agency.Backend.model.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepository extends JpaRepository<Continent, Integer> {
}
