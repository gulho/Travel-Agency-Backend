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
    public boolean saveCity(@RequestBody City city) {
        cityService.saveCity(city);
        return true;
    }
    @DeleteMapping("/{id}")
    public boolean deleteCity(@PathVariable Integer id) {
        cityService.deleteCity(id);
        return true;
    }
}
