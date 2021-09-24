package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.DepartementRepository;

@Service
public class DepartementDBService implements IDBService{

	@Autowired
	DepartementRepository departementRepository;
	
	@Override
	public void populate() {
		departement.setName("IT");
		departement.setDescription("");
		
		departementRepository.save(departement);
		
	}

}
