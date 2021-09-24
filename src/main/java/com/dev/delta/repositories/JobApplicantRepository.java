package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.JobApplicant;

public interface JobApplicantRepository extends JpaRepository<JobApplicant, Long> {

	Optional<JobApplicant> findById(int id);

}
