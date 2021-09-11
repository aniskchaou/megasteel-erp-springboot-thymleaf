package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Operator;

public interface OperatorRepository extends JpaRepository<Operator, Long> {

	Optional<Operator> findById(int id);

}
