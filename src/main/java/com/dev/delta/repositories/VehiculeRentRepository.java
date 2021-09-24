package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.VehiculeRent;

public interface VehiculeRentRepository extends JpaRepository<VehiculeRent, Long> {

	Optional<VehiculeRent> findById(int id);

}
