package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Hotel;
import ee.gulho.travel.Travel.Agency.Backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }
}
