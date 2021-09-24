package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.TerminationRepository;

@Service
public class TerminitionDBService implements IDBService {

	@Autowired
	TerminationRepository terminationRepository;
	
	@Override
	public void populate() {
		termination.setCause(typeTermination);
		termination.setDate(null);
		termination.setEmployee(employee);
		termination.setFirstName("cdc");
		termination.setLastName("");
		terminationRepository.save(termination);
	}

}
