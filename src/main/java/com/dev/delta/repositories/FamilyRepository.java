package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Family;

public interface FamilyRepository extends JpaRepository<Family, Long> {

	Optional<Family> findById(int id);

}
