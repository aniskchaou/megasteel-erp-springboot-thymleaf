package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Machine;
import com.dev.delta.repositories.MachineRepository;
@Service
public class MachineService {
	/**
	 * machineRepository
	 */
	@Autowired
	private MachineRepository machineRepository;
	

	/**
	 * getMachines
	 * @return
	 */
	public List<Machine> getMachines()
	{
		return machineRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return machineRepository.count();
	}

	/**
	 * save
	 * @param machine
	 */
	public void save(Machine machine)
	{
		machineRepository.save(machine);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Machine> findById(int id) {
		return machineRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		machineRepository.delete(machineRepository.findById(id).get());
	}

}
