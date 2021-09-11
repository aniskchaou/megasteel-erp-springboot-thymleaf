package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.PurshaseOrder;

public interface PurshaseOrderRepository extends JpaRepository<PurshaseOrder, Long> {

	Optional<PurshaseOrder> findById(int id);

}
