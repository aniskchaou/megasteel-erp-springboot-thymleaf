package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Activity;
import com.dev.delta.entities.Employee;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

	Optional<Activity> findById(int id);

}
