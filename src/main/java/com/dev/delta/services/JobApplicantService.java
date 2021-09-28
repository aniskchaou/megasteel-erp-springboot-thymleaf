package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.JobApplicant;
import com.dev.delta.repositories.JobApplicantRepository;

@Service
public class JobApplicantService {

	/**
	 * jobApplicantRepository
	 */
	@Autowired
	private JobApplicantRepository jobApplicantRepository;

	/**
	 * getJobApplicants
	 * 
	 * @return
	 */
	public List<JobApplicant> getJobApplicants() {
		return jobApplicantRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return jobApplicantRepository.count();
	}

	/**
	 * save
	 * 
	 * @param jobApplicant
	 */
	public void save(JobApplicant jobApplicant) {
		jobApplicantRepository.save(jobApplicant);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<JobApplicant> findById(int id) {
		return jobApplicantRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		jobApplicantRepository.delete(jobApplicantRepository.findById(id).get());
	}
}
