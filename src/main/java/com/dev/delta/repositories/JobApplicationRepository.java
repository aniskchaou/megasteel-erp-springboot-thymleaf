package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

	Optional<JobApplication> findById(int id);

}
