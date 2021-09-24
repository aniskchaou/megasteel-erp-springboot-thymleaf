package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.InterventionStateRepository;

@Service
public class InterventionStateDBService implements IDBService{

	@Autowired
	InterventionStateRepository interventionStateRepository;
	
	@Override
	public void populate() {
		interventionState.setName("Started");
		interventionState.setName("Pending");
		interventionState.setName("Ended");
		interventionStateRepository.save(interventionState);

	}

}
