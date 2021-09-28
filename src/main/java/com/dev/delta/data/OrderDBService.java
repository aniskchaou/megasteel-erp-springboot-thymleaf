package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.OrderRepository;

@Service
public class OrderDBService implements IDBService {

	@Autowired
	OrderRepository OrderRepository;

	@Override
	public void populate() {
		order.setOrderNumber("D233E");
		order.setDateCreation("12/11/2019");
		order.setDateLimit("11/09/2021");
		order.setState("sent");
		OrderRepository.save(order);
	}

}
