package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.ProviderOrder;

public interface ProviderOrderRepository extends JpaRepository<ProviderOrder, Long> {

	Optional<ProviderOrder> findById(int id);

}
