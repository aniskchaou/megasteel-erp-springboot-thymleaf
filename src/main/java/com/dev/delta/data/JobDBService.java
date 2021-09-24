package com.dev.delta.data;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.JobbRepository;

@Service
public class JobDBService implements IDBService{

	@Autowired
	JobbRepository jobRepository;
	
	@Override
	public void populate() {
		job.setName("Software Engineer");
		job.setDepartement(departement);
		
		jobRepository.save(job);
	}

}
