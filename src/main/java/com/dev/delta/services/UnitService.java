package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Unit;
import com.dev.delta.repositories.UnitRepository;

@Service
public class UnitService {

	/**
	 * unitRepository
	 */
	@Autowired
	private UnitRepository unitRepository;

	/**
	 * getUnits
	 * 
	 * @return
	 */
	public List<Unit> getUnits() {
		return unitRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return unitRepository.count();
	}

	/**
	 * save
	 * 
	 * @param unit
	 */
	public void save(Unit unit) {
		unitRepository.save(unit);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Unit> findById(int id) {
		return unitRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		unitRepository.delete(unitRepository.findById(id).get());
	}
}
