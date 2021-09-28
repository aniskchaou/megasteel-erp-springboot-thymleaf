package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.PartRepository;

@Service
public class PartDBService implements IDBService {

	@Autowired
	PartRepository PartRepository;

	@Override
	public void populate() {

		part.setName("M-Z333");
		part.setReference("32D23D23");

		PartRepository.save(part);

	}

}
