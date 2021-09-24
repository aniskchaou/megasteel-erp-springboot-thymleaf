package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.VatRepository;
@Service
public class VATDBService implements IDBService {
	
	@Autowired
	VatRepository VatRepository;

	@Override
	public void populate() {
		vat.setName("VATZED");
		vat.setRate("18888");
		VatRepository.save(vat);
		
	}

}
