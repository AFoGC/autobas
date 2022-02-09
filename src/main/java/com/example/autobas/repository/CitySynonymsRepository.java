package com.example.autobas.repository;

import com.example.autobas.entity.locations.CitySynonyms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitySynonymsRepository extends JpaRepository<CitySynonyms, Long> {

}
