package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.TypeLeaveRepository;

@Service
public class TypeLEaveDBService implements IDBService {

	@Autowired
	TypeLeaveRepository TypeLeaveRepository;

	@Override
	public void populate() {

		typeLeave.setName("Holiday");
		TypeLeaveRepository.save(typeLeave);
	}

}
