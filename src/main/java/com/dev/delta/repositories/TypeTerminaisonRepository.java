package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.TypeTermination;

public interface TypeTerminaisonRepository extends JpaRepository<TypeTermination, Long> {

	Optional<TypeTermination> findById(int id);

}
