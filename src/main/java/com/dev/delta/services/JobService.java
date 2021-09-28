package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Job;

import com.dev.delta.repositories.JobbRepository;

@Service
public class JobService {

	/**
	 * jobRepository
	 */
	@Autowired
	private JobbRepository jobRepository;

	/**
	 * getJobs
	 * 
	 * @return
	 */
	public List<Job> getJobs() {
		return jobRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return jobRepository.count();
	}

	/**
	 * save
	 * 
	 * @param job
	 */
	public void save(Job job) {
		jobRepository.save(job);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Job> findById(int id) {
		return jobRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		jobRepository.delete(jobRepository.findById(id).get());
	}
}
