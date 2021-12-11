package com.diolabs.distanceapi.distance.controller;

import javax.validation.Valid;

import com.diolabs.distanceapi.distance.service.DistanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distance")
public class DistanceController {
    @Autowired
    private DistanceService distanceService;
    
    @GetMapping("/{type}/{idCity1}/{idCity2}")
    @ResponseStatus(code=HttpStatus.OK)
    public double distance(@Valid @PathVariable String type, @Valid @PathVariable Long idCity1, @Valid @PathVariable Long idCity2){
        return distanceService.calculateDistance(type,idCity1,idCity2);
    }
}
