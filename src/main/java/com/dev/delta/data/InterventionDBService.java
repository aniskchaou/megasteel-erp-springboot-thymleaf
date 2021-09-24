package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.InterventionRepository;

@Service
public class InterventionDBService implements IDBService{

	@Autowired
	InterventionRepository InterventionRepository;
	
	@Override
	public void populate() {
		intervention.setCost("4200");
		intervention.setDate("1/8/2020");
		intervention.setDuration("8 hours");
		intervention.setMachine(machine);
		intervention.setReference("IO7O87");
		intervention.setState(interventionState);
		InterventionRepository.save(intervention);
	}

}
