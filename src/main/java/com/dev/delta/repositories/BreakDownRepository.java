package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Breakdown;

public interface BreakDownRepository extends JpaRepository<Breakdown, Long> {

	Optional<Breakdown> findById(int id);

}
