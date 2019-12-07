package ee.gulho.travel.Travel.Agency.Backend.repository;

import ee.gulho.travel.Travel.Agency.Backend.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    @Query(value = "SELECT countryCode, name FROM country", nativeQuery = true)
    public List<String[]> getAllCountryNames();
}
