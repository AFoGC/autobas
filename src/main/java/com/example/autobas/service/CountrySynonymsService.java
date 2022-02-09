package com.example.autobas.service;

import com.example.autobas.repository.CountrySynonymsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountrySynonymsService {

    private final CountrySynonymsRepository countrySynonymsRepository;

    @Autowired
    public CountrySynonymsService(CountrySynonymsRepository countrySynonymsRepository) {
        this.countrySynonymsRepository = countrySynonymsRepository;
    }
}
