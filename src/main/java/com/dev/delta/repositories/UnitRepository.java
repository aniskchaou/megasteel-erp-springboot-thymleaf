package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {

	Optional<Unit> findById(int id);

}
