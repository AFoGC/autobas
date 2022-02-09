package com.example.autobas.repository;

import com.example.autobas.entity.ClientHasRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientHasRouteRepository extends JpaRepository<ClientHasRoute, Long> {

}
