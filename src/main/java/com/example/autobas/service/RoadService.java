package com.example.autobas.service;

import com.example.autobas.entity.Road;
import com.example.autobas.repository.CityRepository;
import com.example.autobas.repository.RoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadService {

    private final RoadRepository roadRepository;
    private final CityRepository cityRepository;

    @Autowired
    public RoadService(RoadRepository roadRepository, CityRepository cityRepository) {
        this.roadRepository = roadRepository;
        this.cityRepository = cityRepository;
    }


    public void saveRoad(int range, Long city_to, Long city_from){
        Road road = new Road();
        road.setCityFrom(cityRepository.getOne(city_from));
        road.setCityTo(cityRepository.getOne(city_to));
        road.setRange(range);

        roadRepository.save(road);
    }



    public Road getRoad(Long id){
        return roadRepository.getOne(id);
    }

    public List<Road> getAllRoads(){
        return roadRepository.findAll();
    }
}
