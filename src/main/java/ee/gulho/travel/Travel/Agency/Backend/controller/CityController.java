package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.City;
import ee.gulho.travel.Travel.Agency.Backend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping
    public List<City> getAllCity() {
        return cityService.getAllCities();
    }
    @PostMapping
    public void saveCity(@RequestBody City city) {
        cityService.saveCity(city);
    }
    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Integer cityId) {
        cityService.deleteCity(cityId);
    }
}
