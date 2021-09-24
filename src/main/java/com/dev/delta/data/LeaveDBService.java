package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.LeaveRepository;

@Service
public class LeaveDBService implements IDBService
{
	@Autowired
	LeaveRepository LeaveRepository;

	@Override
	public void populate() {
		leave.setEmployee(employee);
		leave.setEndDate(null);
		leave.setFirstName(null);
		leave.setLastName(null);
		leave.setRemainingDays(null);
		leave.setRequestedDays(null);
		leave.setStartDate(null);
		leave.setTypeLeave(typeLeave);
		LeaveRepository.save(leave);
	}

}
