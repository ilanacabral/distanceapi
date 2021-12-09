package com.diolabs.distanceapi.countries.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends RuntimeException{

    public CountryNotFoundException(String message){
        super(message);
    }

    
}
