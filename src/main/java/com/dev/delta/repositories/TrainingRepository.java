package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Training;

public interface TrainingRepository extends JpaRepository<Training, Long> {

	Optional<Training> findById(int id);

}
