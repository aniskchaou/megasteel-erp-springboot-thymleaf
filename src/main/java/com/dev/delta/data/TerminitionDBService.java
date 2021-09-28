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
		termination.setDate("12/3/2020");
		termination.setEmployee(employee);
		termination.setFirstName("Anthony W. ");
		termination.setLastName("Jacobs");
		terminationRepository.save(termination);
	}

}
