package com.diolabs.distanceapi.states.service;

import com.diolabs.distanceapi.states.exception.StateNotFoundException;
import com.diolabs.distanceapi.states.model.State;
import com.diolabs.distanceapi.states.repository.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired 
    private StateRepository stateRepository;

    public Page<State> findAll(Pageable pageable){
        return stateRepository.findAll(pageable);
    }

    public State findByState(Long id){
        return stateRepository.findById(id).orElseThrow(()->new StateNotFoundException("State not found!"));
    }
    
}
