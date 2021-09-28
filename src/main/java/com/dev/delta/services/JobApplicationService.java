package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.JobApplication;
import com.dev.delta.repositories.JobApplicationRepository;

@Service
public class JobApplicationService {
	/**
	 * jobApplicationRepository
	 */
	@Autowired
	private JobApplicationRepository jobApplicationRepository;

	/**
	 * getJobApplications
	 * 
	 * @return
	 */
	public List<JobApplication> getJobApplications() {
		return jobApplicationRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return jobApplicationRepository.count();
	}

	/**
	 * save
	 * 
	 * @param jobApplication
	 */
	public void save(JobApplication jobApplication) {
		jobApplicationRepository.save(jobApplication);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<JobApplication> findById(int id) {
		return jobApplicationRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		jobApplicationRepository.delete(jobApplicationRepository.findById(id).get());
	}
}
