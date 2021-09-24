package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Job;

public interface JobbRepository extends JpaRepository<Job, Long> {

	Optional<Job> findById(int id);

}
