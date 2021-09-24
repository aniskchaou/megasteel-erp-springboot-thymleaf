package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CustomerContractRepository;

@Service
public class CustomerContractDBService implements IDBService{

	@Autowired
	CustomerContractRepository CustomerContractRepository;
	
	@Override
	public void populate() {
		customerContract.setActivationDate("11/02/2021");
		customerContract.setCompany("JHVKU");
		customerContract.setCurrency("euro");
		customerContract.setName("D33DA");
		customerContract.setPartner("uvi-viè-");
		CustomerContractRepository.save(customerContract);
	}

}
