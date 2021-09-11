package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

	Optional<Vehicule> findById(int id);

}
