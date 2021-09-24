package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.dev.delta.entities.VAT;
import com.dev.delta.repositories.VatRepository;

@Service
public class VATService {

	/**
	 * vatRepository
	 */
	@Autowired
	private VatRepository vatRepository;
	

	/**
	 * getVats
	 * @return
	 */
	public List<VAT> getVats()
	{
		return vatRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return vatRepository.count();
	}

	/**
	 * save
	 * @param vat
	 */
	public void save( VAT vat)
	{
		
		vatRepository.save(vat);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<VAT> findById(int id) {
		return vatRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		vatRepository.delete(vatRepository.findById(id).get());
	}
	
}
