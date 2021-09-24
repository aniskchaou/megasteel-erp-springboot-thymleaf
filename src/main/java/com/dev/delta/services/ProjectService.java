package com.dev.delta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Project;
import com.dev.delta.repositories.ProjectRepository;

@Service
public class ProjectService {
	/**
	 * projectRepository
	 */
	@Autowired
	private ProjectRepository projectRepository;
	

	/**
	 * getProjects
	 * @return
	 */
	public List<Project> getProjects()
	{
		return projectRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return projectRepository.count();
	}

	/**
	 * save
	 * @param project
	 */
	public void save(Project project)
	{
		projectRepository.save(project);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Project> findById(int id) {
		return projectRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(int id) {
		projectRepository.delete(projectRepository.findById(id).get());
	}
}
