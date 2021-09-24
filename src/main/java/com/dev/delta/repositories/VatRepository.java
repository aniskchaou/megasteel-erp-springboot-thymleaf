package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.VAT;

public interface VatRepository extends JpaRepository<VAT, Long> {

	Optional<VAT> findById(int id);

}
