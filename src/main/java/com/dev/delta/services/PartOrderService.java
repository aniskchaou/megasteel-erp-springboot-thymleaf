package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.PartOrder;
import com.dev.delta.repositories.PartOrderRepository;

public class PartOrderService {
	/**
	 * clientRepository
	 */
	@Autowired
	private PartOrderRepository clientRepository;
	

	/**
	 * getPartOrders
	 * @return
	 */
	public List<PartOrder> getPartOrders()
	{
		return clientRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return clientRepository.count();
	}

	/**
	 * save
	 * @param client
	 */
	public void save(PartOrder client)
	{
		clientRepository.save(client);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<PartOrder> findById(int id) {
		return clientRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		clientRepository.delete(clientRepository.findById(id).get());
	}
}
