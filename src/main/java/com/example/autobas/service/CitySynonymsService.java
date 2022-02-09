package com.example.autobas.service;

import com.example.autobas.repository.CitySynonymsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitySynonymsService {

    private final CitySynonymsRepository citySynonymsRepository;

    @Autowired
    public CitySynonymsService(CitySynonymsRepository citySynonymsRepository) {
        this.citySynonymsRepository = citySynonymsRepository;
    }
}
