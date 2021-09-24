package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.VehiculeModel;

public interface VehiculeModelRepository extends JpaRepository<VehiculeModel, Long> {

	Optional<VehiculeModel> findById(int id);

}
