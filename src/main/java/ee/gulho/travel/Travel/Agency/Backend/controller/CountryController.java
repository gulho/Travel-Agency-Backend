package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.model.Country;
import ee.gulho.travel.Travel.Agency.Backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getAllNames")
    public List<String[]> getAllCountriesNames() {
        return countryService.getAllCountriesNames();
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public boolean saveCountry(@RequestBody Country country) {
        countryService.saveCountry(country);
        return true;
    }

    @DeleteMapping("/{countryCode}")
    public void deleteCountry(@PathVariable String countryCode) {
        countryService.delete(countryCode);
    }
}
