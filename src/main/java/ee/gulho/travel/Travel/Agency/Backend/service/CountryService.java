package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.Country;
import ee.gulho.travel.Travel.Agency.Backend.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<String[]> getAllCountriesNames() {
        return countryRepository.getAllCountryNames();
//        return List.of(new String[]{"sad"}, new String[]{"sad"});
    }

    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public void delete(String countryCode) {
        countryRepository.deleteById(countryCode);
    }
}
