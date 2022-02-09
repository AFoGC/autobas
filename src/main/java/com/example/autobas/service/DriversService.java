package com.example.autobas.service;

import com.example.autobas.repository.DriversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriversService {

    private final DriversRepository driversRepository;

    @Autowired
    public DriversService(DriversRepository driversRepository) {
        this.driversRepository = driversRepository;
    }
}
