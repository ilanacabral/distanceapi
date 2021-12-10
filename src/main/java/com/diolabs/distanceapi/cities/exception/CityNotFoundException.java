package com.diolabs.distanceapi.cities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CityNotFoundException extends RuntimeException {
    
    public CityNotFoundException(String message){
        super(message);
    }
}
