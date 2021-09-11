package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.ExternalProvider;

public interface ExternalProviderRepository extends JpaRepository<ExternalProvider, Long> {

	Optional<ExternalProvider> findById(int id);

}
