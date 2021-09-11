package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Employee;
import com.dev.delta.repositories.EmployeeRepository;

public class EmployeeService {
	/**
	 * employeeRepository
	 */
	@Autowired
	private EmployeeRepository employeeRepository;
	

	/**
	 * getEmployees
	 * @return
	 */
	public List<Employee> getEmployees()
	{
		return employeeRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return employeeRepository.count();
	}

	/**
	 * save
	 * @param employee
	 */
	public void save(Employee employee)
	{
		employeeRepository.save(employee);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		employeeRepository.delete(employeeRepository.findById(id).get());
	}
}