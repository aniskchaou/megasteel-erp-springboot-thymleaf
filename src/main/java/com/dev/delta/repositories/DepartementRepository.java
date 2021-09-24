package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

	Optional<Departement> findById(int id);

}
