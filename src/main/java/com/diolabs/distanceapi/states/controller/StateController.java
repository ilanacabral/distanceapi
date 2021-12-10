package com.diolabs.distanceapi.states.controller;

import javax.validation.Valid;

import com.diolabs.distanceapi.states.model.State;
import com.diolabs.distanceapi.states.service.StateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {
    
    @Autowired
    private StateService stateService;

    @GetMapping("/")
    public Page<State> findAll(Pageable pageable){
        return stateService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public State findById(@Valid @PathVariable Long id){
        return stateService.findByState(id);
    }
}
