package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Part;

public interface PartRepository extends JpaRepository<Part, Long> {

	Optional<Part> findById(int id);

}
