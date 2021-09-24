package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Expense;
import com.dev.delta.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	/**
	 * expenseRepository
	 */
	@Autowired
	private ExpenseRepository expenseRepository;
	

	/**
	 * getExpenses
	 * @return
	 */
	public List<Expense> getExpenses()
	{
		return expenseRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return expenseRepository.count();
	}

	/**
	 * save
	 * @param expense
	 */
	public void save(Expense expense)
	{
		expenseRepository.save(expense);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Expense> findById(int id) {
		return expenseRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		expenseRepository.delete(expenseRepository.findById(id).get());
	}
}
