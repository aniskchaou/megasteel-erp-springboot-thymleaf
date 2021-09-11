package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dev.delta.entities.Activity;
import com.dev.delta.repositories.ActivityRepository;

public class ActivityService  {

	/**
	 * activityRepository
	 */
	@Autowired
	private ActivityRepository activityRepository;
	

	/**
	 * getActivitys
	 * @return
	 */
	public List<Activity> getActivitys()
	{
		return activityRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return activityRepository.count();
	}

	/**
	 * save
	 * @param activity
	 */
	public void save(Activity activity)
	{
		activityRepository.save(activity);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Activity> findById(int id) {
		return activityRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		activityRepository.delete(activityRepository.findById(id).get());
	}
    
}
