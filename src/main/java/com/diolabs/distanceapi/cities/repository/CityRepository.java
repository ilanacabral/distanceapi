package com.diolabs.distanceapi.cities.repository;

import com.diolabs.distanceapi.cities.model.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    
}
