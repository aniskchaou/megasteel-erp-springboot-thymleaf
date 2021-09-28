package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.WareHouse;
import com.dev.delta.repositories.WareHouseRepository;

@Service
public class WareHouseService {
	/**
	 * wareHouseRepository
	 */
	@Autowired
	private WareHouseRepository wareHouseRepository;

	/**
	 * getWareHouses
	 * 
	 * @return
	 */
	public List<WareHouse> getWareHouses() {
		return wareHouseRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return wareHouseRepository.count();
	}

	/**
	 * save
	 * 
	 * @param wareHouse
	 */
	public void save(WareHouse wareHouse) {
		wareHouseRepository.save(wareHouse);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<WareHouse> findById(int id) {
		return wareHouseRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		wareHouseRepository.delete(wareHouseRepository.findById(id).get());
	}
}
