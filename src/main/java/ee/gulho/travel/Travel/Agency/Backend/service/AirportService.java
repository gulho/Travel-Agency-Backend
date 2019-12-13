package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.Airport;
import ee.gulho.travel.Travel.Agency.Backend.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public void saveAirport(Airport airport) {
        airportRepository.save(airport);
    }

    public void removeAirport(String code) {
        airportRepository.deleteById(code);
    }
}
