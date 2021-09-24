package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.WareHouse;

public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {

	Optional<WareHouse> findById(int id);

}
