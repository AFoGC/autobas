package com.example.autobas.service;

import com.example.autobas.repository.RouteHasRoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteHasRoadService {

    private final RouteHasRoadRepository routeHasRoadRepository;

    @Autowired
    public RouteHasRoadService(RouteHasRoadRepository routeHasRoadRepository) {
        this.routeHasRoadRepository = routeHasRoadRepository;
    }


}
