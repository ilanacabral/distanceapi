package com.diolabs.distanceapi.countries.model;

import javax.validation.Valid;

import com.diolabs.distanceapi.countries.exception.CountryNotFoundException;
import com.diolabs.distanceapi.countries.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    
    @Autowired 
    private CountryRepository countryRepository;

    public Page<Country> findAll(Pageable page){
        return countryRepository.findAll(page);
    }

    public Country findById(@Valid Long id) {
        return countryRepository.findById(id).orElseThrow(()-> new CountryNotFoundException("Country not found!"));
    }
}
