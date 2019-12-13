package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Airport;
import ee.gulho.travel.Travel.Agency.Backend.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airport")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping
    public boolean saveAirport(@RequestBody Airport airport) {
        airportService.saveAirport(airport);
        return true;
    }

    @DeleteMapping("/{code}")
    public boolean deleteAirport(@PathVariable String code) {
        airportService.removeAirport(code);
        return true;
    }
}
