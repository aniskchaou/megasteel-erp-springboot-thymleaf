package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Training;
import com.dev.delta.repositories.TrainingRepository;

@Service
public class TrainingService {

	/**
	 * trainingRepository
	 */
	@Autowired
	private TrainingRepository trainingRepository;
	

	/**
	 * getTrainings
	 * @return
	 */
	public List<Training> getTrainings()
	{
		return trainingRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return trainingRepository.count();
	}

	/**
	 * save
	 * @param training
	 */
	public void save(Training training)
	{
		trainingRepository.save(training);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Training> findById(int id) {
		return trainingRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		trainingRepository.delete(trainingRepository.findById(id).get());
	}
}
