package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Event;

public interface EventRepository extends JpaRepository<com.dev.delta.entities.Event, Long> {

	Optional<Event> findById(int id);

}
