package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ProviderContractRepository;

@Service
public class ProviderContractDBService implements IDBService{

	@Autowired
	ProviderContractRepository providerContractRepository;
	
	@Override
	public void populate() {
		providerContract.setActivationDate("kl");
		providerContract.setCurrency("lnkl");
		providerContract.setEndDate("lkn");
		providerContract.setName("lkkl");
		providerContract.setPartner("kln,");
		providerContractRepository.save(providerContract);
	}

}
