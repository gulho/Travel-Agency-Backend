package ee.gulho.travel.Travel.Agency.Backend.repository;

import ee.gulho.travel.Travel.Agency.Backend.model.Image;
import ee.gulho.travel.Travel.Agency.Backend.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    public List<Image> findAllByTrip(Trip trip);
}
