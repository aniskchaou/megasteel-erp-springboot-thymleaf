package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Machine;

public interface MachineRepository extends JpaRepository<Machine, Long> {

	Optional<Machine> findById(int id);

}
