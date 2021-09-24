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
		provider.setAddress(null);
		provider.setCode(null);
		provider.setFax(null);
		provider.setName(null);
		provider.setPhone(null);
		provider.setResponsable(null);
		provider.setVat(vat);
		
		providerRepository.save(provider);
		
	}

}
