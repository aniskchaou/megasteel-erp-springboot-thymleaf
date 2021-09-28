package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.PurshaseOrderRepository;

@Service
public class PurshaseOrderDBService implements IDBService {

	@Autowired
	PurshaseOrderRepository purshaseOrderRepository;

	@Override
	public void populate() {
		purshaseOrder.setApplicant("kjbklj");
		purshaseOrder.setDate("12/33/2020");
		purshaseOrder.setQuantity("66");
		purshaseOrderRepository.save(purshaseOrder);
	}

}
