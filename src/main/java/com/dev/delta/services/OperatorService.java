package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Operator;
import com.dev.delta.repositories.OperatorRepository;

public class OperatorService {
	/**
	 * operatorRepository
	 */
	@Autowired
	private OperatorRepository operatorRepository;
	

	/**
	 * getOperators
	 * @return
	 */
	public List<Operator> getOperators()
	{
		return operatorRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return operatorRepository.count();
	}

	/**
	 * save
	 * @param operator
	 */
	public void save(Operator operator)
	{
		operatorRepository.save(operator);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Operator> findById(int id) {
		return operatorRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		operatorRepository.delete(operatorRepository.findById(id).get());
	}

}
