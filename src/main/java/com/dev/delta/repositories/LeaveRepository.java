package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Long> {

	Optional<Leave> findById(int id);

}
