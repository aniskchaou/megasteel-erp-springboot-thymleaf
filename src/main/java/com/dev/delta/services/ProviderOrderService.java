package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ProviderOrder;
import com.dev.delta.repositories.ProviderOrderRepository;

@Service
public class ProviderOrderService {
	/**
	 * providerOrderRepository
	 */
	@Autowired
	private ProviderOrderRepository providerOrderRepository;

	/**
	 * getProviderOrders
	 * 
	 * @return
	 */
	public List<ProviderOrder> getProviderOrders() {
		return providerOrderRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return providerOrderRepository.count();
	}

	/**
	 * save
	 * 
	 * @param providerOrder
	 */
	public void save(ProviderOrder providerOrder) {
		providerOrderRepository.save(providerOrder);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<ProviderOrder> findById(int id) {
		return providerOrderRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		providerOrderRepository.delete(providerOrderRepository.findById(id).get());
	}
}
