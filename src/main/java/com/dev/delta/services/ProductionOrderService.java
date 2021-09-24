package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ProductionOrder;
import com.dev.delta.repositories.ProductionOrderRepository;
@Service
public class ProductionOrderService {

	/**
	 * productionOrderRepository
	 */
	@Autowired
	private ProductionOrderRepository productionOrderRepository;
	

	/**
	 * getProductionOrders
	 * @return
	 */
	public List<ProductionOrder> getProductionOrders()
	{
		return productionOrderRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return productionOrderRepository.count();
	}

	/**
	 * save
	 * @param productionOrder
	 */
	public void save(ProductionOrder productionOrder)
	{
		productionOrderRepository.save(productionOrder);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<ProductionOrder> findById(int id) {
		return productionOrderRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		productionOrderRepository.delete(productionOrderRepository.findById(id).get());
	}
}
