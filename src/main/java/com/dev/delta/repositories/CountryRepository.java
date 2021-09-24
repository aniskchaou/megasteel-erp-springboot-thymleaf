package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	Optional<Country> findById(int id);

}
