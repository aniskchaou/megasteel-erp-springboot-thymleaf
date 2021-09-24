package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.InterventionStatus;


public interface InterventionStateRepository extends JpaRepository<InterventionStatus, Long> {

	Optional<InterventionStatus> findById(int id);

}
