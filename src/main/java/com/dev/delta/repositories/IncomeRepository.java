package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {

	Optional<Income> findById(int id);

}
