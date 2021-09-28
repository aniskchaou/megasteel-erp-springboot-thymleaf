package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.TypeTerminaisonRepository;

@Service
public class TypeTerminaisonDBService implements IDBService {

	@Autowired
	TypeTerminaisonRepository typeTerminaisonRepository;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		typeTermination.setName("Resign");
		typeTerminaisonRepository.save(typeTermination);
	}

}
