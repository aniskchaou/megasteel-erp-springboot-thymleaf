package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	Optional<Expense> findById(int id);

}
