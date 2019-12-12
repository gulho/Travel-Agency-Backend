package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.City;
import ee.gulho.travel.Travel.Agency.Backend.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
    public void saveCity(City city) {
        cityRepository.save(city);
    }
    public void deleteCity(Integer cityId) {
        cityRepository.deleteById(cityId);
    }
}
