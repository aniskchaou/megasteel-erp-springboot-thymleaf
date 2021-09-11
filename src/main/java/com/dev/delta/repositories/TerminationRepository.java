package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Termination;

public interface TerminationRepository extends JpaRepository<Termination, Long> {

	Optional<Termination> findById(int id);

}
