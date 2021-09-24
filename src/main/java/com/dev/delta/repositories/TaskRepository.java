package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

	Optional<Task> findById(int id);

}
