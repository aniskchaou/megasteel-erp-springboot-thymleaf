package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.ProviderContract;

public interface ProviderContractRepository extends JpaRepository<ProviderContract, Long> {

	Optional<ProviderContract> findById(int id);

}
