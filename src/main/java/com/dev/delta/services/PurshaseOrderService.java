package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.PurshaseOrder;
import com.dev.delta.repositories.PurshaseOrderRepository;

public class PurshaseOrderService {

	/**
	 * purshaseOrderRepository
	 */
	@Autowired
	private PurshaseOrderRepository purshaseOrderRepository;
	

	/**
	 * getPurshaseOrders
	 * @return
	 */
	public List<PurshaseOrder> getPurshaseOrders()
	{
		return purshaseOrderRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return purshaseOrderRepository.count();
	}

	/**
	 * save
	 * @param purshaseOrder
	 */
	public void save(PurshaseOrder purshaseOrder)
	{
		purshaseOrderRepository.save(purshaseOrder);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<PurshaseOrder> findById(int id) {
		return purshaseOrderRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		purshaseOrderRepository.delete(purshaseOrderRepository.findById(id).get());
	}
}
