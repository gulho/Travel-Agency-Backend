package ee.gulho.travel.Travel.Agency.Backend.controller;

import ee.gulho.travel.Travel.Agency.Backend.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trip/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getAllNames")
    public List<String[]> getAllCountriesNames() {
        return countryService.getAllCountries();
    }
}
