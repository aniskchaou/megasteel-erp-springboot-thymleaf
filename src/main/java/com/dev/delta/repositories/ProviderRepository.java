package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

	Optional<Provider> findById(int id);

}
