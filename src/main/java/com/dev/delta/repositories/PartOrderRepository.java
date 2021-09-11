package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.PartOrder;

public interface PartOrderRepository extends JpaRepository<PartOrder, Long> {

	Optional<PartOrder> findById(int id);

}
