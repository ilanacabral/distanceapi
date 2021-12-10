package com.diolabs.distanceapi.states.repository;

import com.diolabs.distanceapi.states.model.State;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{
    
}
