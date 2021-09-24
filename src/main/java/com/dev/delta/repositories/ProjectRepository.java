package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	Optional<Project> findById(int id);

}
