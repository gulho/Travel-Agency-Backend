package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.Trip;
import ee.gulho.travel.Travel.Agency.Backend.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    private TripRepository tripRepository;

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public List<Trip> getAllPromotedTrips() {
        return tripRepository.findAllByIsPromotedTrue();
    }

    public Trip getTripById(Integer id) {
        return tripRepository.findById(id).orElseThrow();
    }

    public void saveTrip(Trip trip) {
        tripRepository.save(trip);
    }

    public void deleteTrip(Integer id) {
        tripRepository.deleteById(id);
    }
}
