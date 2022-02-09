package com.example.autobas.service;

import com.example.autobas.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientHasRouteService {

    private final ClientsRepository clientsRepository;

    @Autowired
    public ClientHasRouteService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }
}
