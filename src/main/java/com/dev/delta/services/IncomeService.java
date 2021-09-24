package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Income;
import com.dev.delta.repositories.IncomeRepository;

@Service
public class IncomeService {

	/**
	 * incomeRepository
	 */
	@Autowired
	private IncomeRepository incomeRepository;
	

	/**
	 * getIncomes
	 * @return
	 */
	public List<Income> getIncomes()
	{
		return incomeRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return incomeRepository.count();
	}

	/**
	 * save
	 * @param income
	 */
	public void save(Income income)
	{
		incomeRepository.save(income);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Income> findById(int id) {
		return incomeRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		incomeRepository.delete(incomeRepository.findById(id).get());
	}
}
