package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {

	Optional<Intervention> findById(int id);

}
