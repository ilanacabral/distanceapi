package com.diolabs.distanceapi.distance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class TypeNotFoundException extends RuntimeException{

    public TypeNotFoundException(String message){
        super(message);
    }
    
}
