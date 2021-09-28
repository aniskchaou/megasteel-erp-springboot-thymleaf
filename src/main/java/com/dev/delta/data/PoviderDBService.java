package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ProviderRepository;

@Service
public class PoviderDBService implements IDBService {

	@Autowired
	ProviderRepository providerRepository;

	@Override
	public void populate() {
		provider.setAddress("3533 Bobcat Drive\r\n" + "Washington, MD 20005");
		provider.setCode("87BY8Y");
		provider.setFax("240-868-0377");
		provider.setName("Crystal Steel");
		provider.setPhone("240-868-0377");
		provider.setResponsable("Emma A. Mosley");
		provider.setVat(vat);

		providerRepository.save(provider);

	}

}
