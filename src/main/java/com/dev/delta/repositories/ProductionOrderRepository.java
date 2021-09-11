package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.controllers.ProductionOrder;

public interface ProductionOrderRepository extends JpaRepository<com.dev.delta.entities.ProductionOrder,Long> {

	Optional<com.dev.delta.entities.ProductionOrder> findById(int id);

}
