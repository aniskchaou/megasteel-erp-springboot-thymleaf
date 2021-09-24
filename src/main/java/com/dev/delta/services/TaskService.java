package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Task;
import com.dev.delta.repositories.TaskRepository;

@Service
public class TaskService {

	/**
	 * taskRepository
	 */
	@Autowired
	private TaskRepository taskRepository;
	

	/**
	 * getTasks
	 * @return
	 */
	public List<Task> getTasks()
	{
		return taskRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return taskRepository.count();
	}

	/**
	 * save
	 * @param task
	 */
	public void save(Task task)
	{
		taskRepository.save(task);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Task> findById(int id) {
		return taskRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		taskRepository.delete(taskRepository.findById(id).get());
	}
}
