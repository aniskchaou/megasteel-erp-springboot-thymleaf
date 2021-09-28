package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.EmployeeRepository;

@Service
public class EmployeeDBService implements IDBService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void populate() {
		employee.setAddress("1087 Leisure Lane\r\n" + "San Luis Obispo, CA 93401");
		employee.setChildren("3");
		employee.setCode("E32323E");
		employee.setDateBirth("10/09/1990");
		employee.setDateRecuitement("19/02/2020");
		employee.setFirstName("Stephanie ");
		employee.setJob(job);
		employee.setLastName("W. Williams");

		employeeRepository.save(employee);
	}

}
