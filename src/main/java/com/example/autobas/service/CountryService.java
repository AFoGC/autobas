package com.example.autobas.service;

import com.example.autobas.entity.locations.Country;
import com.example.autobas.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;


    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public boolean saveCountry(String name, Boolean eu){
        Country country = new Country();
        country.setName(name);
        country.setEu(eu);

        try{
            countryRepository.save(country);
            return true;
        }catch (Error error){
            return false;
        }
    }

    public void updateCountry(Long id, String name, Boolean eu){
        Country country = new Country();
        country.setId(id);
        country.setName(name);
        country.setEu(eu);

        countryRepository.save(country);
    }

    public Country getCountry(Long id){
        return countryRepository.getOne(id);
    }

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    public void deleteCountry(Long id){
        countryRepository.deleteById(id);
    }

    public void deleteAll(){
        countryRepository.deleteAll();
    }

    //public void
}
