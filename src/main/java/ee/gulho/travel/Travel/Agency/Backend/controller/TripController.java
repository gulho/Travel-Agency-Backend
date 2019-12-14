package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Trip;
import ee.gulho.travel.Travel.Agency.Backend.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping("/promoted")
    public List<Trip> getAllPromotedTrip() {
        return tripService.getAllPromotedTrips();
    }

    @PostMapping
    public boolean saveTrip(@RequestBody Trip trip) {
        tripService.saveTrip(trip);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean deleteTrip(@PathVariable Integer id) {
        tripService.deleteTrip(id);
        return true;
    }
}
