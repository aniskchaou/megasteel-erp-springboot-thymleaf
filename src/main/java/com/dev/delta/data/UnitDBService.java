package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Unit;
import com.dev.delta.repositories.UnitRepository;

@Service
public class UnitDBService implements IDBService {

	@Autowired
	UnitRepository unitRepository;

	@Override
	public void populate() {
		unit.setDesription("");
		unit.setName("KG");

		unitRepository.save(unit);
	}

}
