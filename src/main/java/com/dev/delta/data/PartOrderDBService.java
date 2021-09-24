package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.PartOrderRepository;

@Service
public class PartOrderDBService implements IDBService{

	@Autowired
	PartOrderRepository partOrderRepository;
	
	@Override
	public void populate() {
		partOrder.setDate("22-05-2020");
		partOrder.setPart(part);
		partOrder.setQuantity("33");
		partOrder.setUnit("kg");
		
		partOrderRepository.save(partOrder);
		
	}

}
