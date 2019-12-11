package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.Hotel;
import ee.gulho.travel.Travel.Agency.Backend.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(Integer hotel_id) {
        return hotelRepository.findById(hotel_id).orElse(new Hotel());
    }
}
