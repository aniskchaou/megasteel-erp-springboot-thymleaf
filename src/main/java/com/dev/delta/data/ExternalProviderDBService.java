package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ExternalProviderRepository;

@Service
public class ExternalProviderDBService implements IDBService {

	@Autowired
	ExternalProviderRepository externalProviderRepository;

	@Override
	public void populate() {

		externalProvider.setMark("19");
		externalProvider.setName("ZSZZ");
		externalProviderRepository.save(externalProvider);
	}

}
