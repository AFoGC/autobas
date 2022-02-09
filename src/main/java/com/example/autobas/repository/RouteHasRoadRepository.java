package com.example.autobas.repository;

import com.example.autobas.entity.RouteHasRoad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteHasRoadRepository extends JpaRepository<RouteHasRoad, Long> {
}
