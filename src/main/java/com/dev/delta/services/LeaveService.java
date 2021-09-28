package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Leave;
import com.dev.delta.repositories.LeaveRepository;

@Service
public class LeaveService {
	/**
	 * leaveRepository
	 */
	@Autowired
	private LeaveRepository leaveRepository;

	/**
	 * getLeaves
	 * 
	 * @return
	 */
	public List<Leave> getLeaves() {
		return leaveRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return leaveRepository.count();
	}

	/**
	 * save
	 * 
	 * @param leave
	 */
	public void save(Leave leave) {
		leaveRepository.save(leave);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Leave> findById(int id) {
		return leaveRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		leaveRepository.delete(leaveRepository.findById(id).get());
	}
}