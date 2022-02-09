package com.example.autobas.repository;


import com.example.autobas.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {

    List<Clients> findAllByFirstName(String firstName);
    List<Clients> findAllByLastName(String lastName);
    List<Clients> findAllByFirstNameAndLastName(String firstName, String lastName);
}
