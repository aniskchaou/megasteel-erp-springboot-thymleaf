package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MAchineDBService implements IDBService{

	@Autowired
	com.dev.delta.repositories.MachineRepository MachineRepository;
	
	
	@Override
	public void populate() {
	  machine.setName("M-3E23E");
	  machine.setProduction("2232");
	  machine.setServiceTime("8 hours");
	  machine.setState("running");
	  machine.setStopTime("8 hours");
	 
		MachineRepository.save(machine);
		
	}

}
