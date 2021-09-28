package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BreakDownRepository;

@Service
public class BreakDownDBService implements IDBService {

	@Autowired
	BreakDownRepository BreakDownRepository;

	@Override
	public void populate() {
		breakdown.setName("ERROR");
		breakdown.setOccurance("3");

		BreakDownRepository.save(breakdown);
	}

}
