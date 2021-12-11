package com.diolabs.distanceapi.distance.service;

import com.diolabs.distanceapi.cities.exception.CityNotFoundException;
import com.diolabs.distanceapi.cities.model.City;
import com.diolabs.distanceapi.cities.repository.CityRepository;
import com.diolabs.distanceapi.distance.exception.TypeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {

    @Autowired
    private CityRepository cityRepository;

    public double calculateDistance(String type, Long idCity1, Long idCity2) {

        if (!type.equals("points") && !type.equals("cube")) throw new TypeNotFoundException("Type not found!");
        
        City city1 = cityRepository.findById(idCity1).orElseThrow(() -> new CityNotFoundException("City not found!"));
        City city2 = cityRepository.findById(idCity2).orElseThrow(() -> new CityNotFoundException("City not found!"));

        if (type.equals("points")) {
            return cityRepository.calculateDistanteByPoinysInMiles(city1.getId(), city2.getId());
        } else {
            Point p1 = city1.getLocation();
            Point p2 = city2.getLocation();
            return cityRepository.calculateDistanceByCubeInMeters(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        }

    }

}
