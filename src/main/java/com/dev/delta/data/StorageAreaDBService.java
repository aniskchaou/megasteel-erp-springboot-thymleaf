package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.StorageAreaRepository;

@Service
public class StorageAreaDBService implements IDBService {

	@Autowired
	StorageAreaRepository storageAreaRepository;

	@Override
	public void populate() {
		storageArea.setName("10");
		storageAreaRepository.save(storageArea);

	}

}
