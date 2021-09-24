package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.OperatorRepository;

@Service
public class OperatorDBService implements IDBService {

	@Autowired
	OperatorRepository  OperatorRepository;
	
	@Override
	public void populate() {
		operator.setCode("HO8G878");
		operator.setEmail("joe.doe@yahoo.com");
		operator.setEtat("Active");
		operator.setNom("John");
		operator.setPrenom("Doe");
		operator.setTelephone("96978698");
	}

}
