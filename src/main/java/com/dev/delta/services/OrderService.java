package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Order;
import com.dev.delta.repositories.OrderRepository;

public class OrderService {
	/**
	 * orderRepository
	 */
	@Autowired
	private OrderRepository orderRepository;
	

	/**
	 * getOrders
	 * @return
	 */
	public List<Order> getOrders()
	{
		return orderRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return orderRepository.count();
	}

	/**
	 * save
	 * @param order
	 */
	public void save(Order order)
	{
		orderRepository.save(order);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Order> findById(int id) {
		return orderRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		orderRepository.delete(orderRepository.findById(id).get());
	}
}
