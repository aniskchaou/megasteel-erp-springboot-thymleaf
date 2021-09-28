package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.LeaveRepository;

@Service
public class LeaveDBService implements IDBService {
	@Autowired
	LeaveRepository LeaveRepository;

	@Override
	public void populate() {
		leave.setEmployee(employee);
		leave.setEndDate("12/10/2020");
		leave.setFirstName("Cynthia");
		leave.setLastName("D. Johnson");
		leave.setRemainingDays("5 days");
		leave.setRequestedDays("7 days");
		leave.setStartDate("12/06/1990");
		leave.setTypeLeave(typeLeave);
		LeaveRepository.save(leave);
	}

}
