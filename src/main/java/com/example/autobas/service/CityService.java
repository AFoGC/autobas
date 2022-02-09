package com.example.autobas.service;

import com.example.autobas.entity.locations.City;
import com.example.autobas.repository.CityRepository;
import com.example.autobas.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    @Autowired
    public CityService(CityRepository cityRepository, CountryRepository countryRepository) {
        this.cityRepository = cityRepository;
        this.countryRepository = countryRepository;
    }

    public void saveCity(String name, Long city_id){
        City city = new City();
        city.setName(name);
        city.setCountryInCity(countryRepository.getOne(city_id));

        cityRepository.save(city);
    }

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public void deleteCity(Long id){
        cityRepository.deleteById(id);
    }
}
