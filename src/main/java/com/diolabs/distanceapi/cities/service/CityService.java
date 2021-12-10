package com.diolabs.distanceapi.cities.service;

import com.diolabs.distanceapi.cities.exception.CityNotFoundException;
import com.diolabs.distanceapi.cities.model.City;
import com.diolabs.distanceapi.cities.repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    
    @Autowired
    private CityRepository cityRepository;

    public Page<City> findAll(Pageable pageable){
        return cityRepository.findAll(pageable);
    }

    public City findById(Long id){
        return cityRepository.findById(id).orElseThrow(()->new CityNotFoundException("City not found!"));
    }
}
