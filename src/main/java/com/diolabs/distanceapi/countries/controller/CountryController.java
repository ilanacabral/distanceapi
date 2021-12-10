package com.diolabs.distanceapi.countries.controller;

import javax.validation.Valid;

import com.diolabs.distanceapi.countries.model.Country;
import com.diolabs.distanceapi.countries.service.CountryService;

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
@RequestMapping("/countries")
public class CountryController {
    
    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK)
    public Page<Country> findAll(Pageable page){
        return countryService.findAll(page);
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Country findById(@Valid @PathVariable Long id){
        return countryService.findById(id);
    }
}
