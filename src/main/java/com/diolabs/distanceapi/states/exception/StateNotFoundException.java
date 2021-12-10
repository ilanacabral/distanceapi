package com.diolabs.distanceapi.states.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class StateNotFoundException extends RuntimeException {

    public StateNotFoundException(String message){
        super(message);
    }

    
}
