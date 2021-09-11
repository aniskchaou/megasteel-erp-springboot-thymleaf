package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.PreventiveMaintenance;


public interface PreventiveMaintenancerepository extends JpaRepository<com.dev.delta.entities.PreventiveMaintenance, Long> {

	Optional<PreventiveMaintenance> findById(int id);

}
