package com.example.autobas.service;

import com.example.autobas.entity.Road;
import com.example.autobas.entity.locations.City;
import com.example.autobas.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;
    private final RoadRepository roadRepository;
    private final CarRepository carRepository;
    private final DriversRepository driversRepository;
    private final CityRepository cityRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository, RoadRepository roadRepository, CarRepository carRepository, DriversRepository driversRepository, CityRepository cityRepository) {
        this.routeRepository = routeRepository;
        this.roadRepository = roadRepository;
        this.carRepository = carRepository;
        this.driversRepository = driversRepository;
        this.cityRepository = cityRepository;
    }

    public void saveRoute(Long city_from_id, Long city_to_id, Long driver_id, int routeTime){
        List<Road> roads = roadRepository.findAll();
        List<Road> answer = roadRepository.findAll();
        List<City> cities = cityRepository.findAll();

        for (City city : cities){
            if(city.getId() == city_from_id){

            }
        }

        //routeRepository.save();
    }
}
