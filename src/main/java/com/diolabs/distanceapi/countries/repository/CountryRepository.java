package com.diolabs.distanceapi.countries.repository;

import com.diolabs.distanceapi.countries.model.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{
    
}
