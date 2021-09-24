package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.TypeLeave;
import com.dev.delta.repositories.TypeLeaveRepository;
import com.dev.delta.repositories.VatRepository;

@Service
public class TypeLeaveService {
	/**
	 * typeLeaveRepositorya
	 */
	@Autowired
	private TypeLeaveRepository typeLeaveRepositorya;
	

	/**
	 * getVats
	 * @return
	 */
	public List<TypeLeave> getTypeLeaves()
	{
		return typeLeaveRepositorya.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return typeLeaveRepositorya.count();
	}

	/**
	 * save
	 * @param vat
	 */
	public void save(TypeLeave vat)
	{
		typeLeaveRepositorya.save(vat);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<TypeLeave> findById(int id) {
		return typeLeaveRepositorya.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		typeLeaveRepositorya.delete(typeLeaveRepositorya.findById(id).get());
	}
	
}
