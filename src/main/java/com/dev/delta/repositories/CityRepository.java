package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

	Optional<City> findById(int id);

}
