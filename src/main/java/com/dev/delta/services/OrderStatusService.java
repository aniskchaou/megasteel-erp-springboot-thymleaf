package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.OrderState;
import com.dev.delta.repositories.OrderStateRepository;
@Service
public class OrderStatusService {

	/**
	 * orderStateRepository
	 */
	@Autowired
	private OrderStateRepository orderStateRepository;
	

	/**
	 * getOrderStates
	 * @return
	 */
	public List<OrderState> getOrderStates()
	{
		return orderStateRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return orderStateRepository.count();
	}

	/**
	 * save
	 * @param orderState
	 */
	public void save(OrderState orderState)
	{
		orderStateRepository.save(orderState);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<OrderState> findById(int id) {
		return orderStateRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		orderStateRepository.delete(orderStateRepository.findById(id).get());
	}
}
