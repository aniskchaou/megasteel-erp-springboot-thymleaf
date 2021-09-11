package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.PaySlip;
import com.dev.delta.repositories.PaySlipRepository;

public class PaySlipService  {
	/**
	 * paySlipRepository
	 */
	@Autowired
	private PaySlipRepository paySlipRepository;
	

	/**
	 * getPaySlips
	 * @return
	 */
	public List<PaySlip> getPaySlips()
	{
		return paySlipRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return paySlipRepository.count();
	}

	/**
	 * save
	 * @param paySlip
	 */
	public void save(PaySlip paySlip)
	{
		paySlipRepository.save(paySlip);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<PaySlip> findById(int id) {
		return paySlipRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		paySlipRepository.delete(paySlipRepository.findById(id).get());
	}

}