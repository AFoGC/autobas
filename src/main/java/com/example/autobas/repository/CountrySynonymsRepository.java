package com.example.autobas.repository;

import com.example.autobas.entity.locations.CountrySynonyms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountrySynonymsRepository extends JpaRepository<CountrySynonyms, Long> {

}
