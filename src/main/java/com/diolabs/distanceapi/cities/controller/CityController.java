package com.diolabs.distanceapi.cities.controller;

import javax.validation.Valid;

import com.diolabs.distanceapi.cities.model.City;
import com.diolabs.distanceapi.cities.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {
    
    @Autowired
    private CityService cityService;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public Page<City> findAll(Pageable pageable){
        return cityService.findAll(pageable);
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public City findById(@Valid @PathVariable Long id){
        return cityService.findById(id);
    }
}
