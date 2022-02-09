package com.example.autobas.service;

import com.example.autobas.entity.Clients;
import com.example.autobas.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {

    private final ClientsRepository clientsRepository;

    @Autowired
    public ClientsService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public void saveClient(String email, String firstName, String lastName){
        Clients client = new Clients();
        client.setEmail(email);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        //client.setPassword(password);
        //client.setVerified(verified);

        clientsRepository.save(client);
    }

    public void updateClient(Long id, String email, String firstName, String lastName){
        Clients client = new Clients();
        client.setId(id);
        client.setEmail(email);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        //client.setPassword(password);
        //client.setVerified(verified);

        clientsRepository.save(client);
    }

    public List<Clients> getClientsList(){
        return clientsRepository.findAll();
    }

    public Clients getClientById(Long id){
        return clientsRepository.getOne(id);
    }

    public void deleteClient(Long id){
        clientsRepository.deleteById(id);
    }

    public void deleteAll(){
        clientsRepository.deleteAll();
    }
}
