package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ProjectRepository;

@Service
public class ProjectDBService implements IDBService {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public void populate() {
		project.setCode(null);
		// projectRepository.save(null)
	}

}
