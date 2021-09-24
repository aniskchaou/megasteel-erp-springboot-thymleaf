package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.TypeLeave;

public interface TypeLeaveRepository extends JpaRepository<TypeLeave, Long> {

	Optional<TypeLeave> findById(int id);

}
