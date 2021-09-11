package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.CustomerContract;

public interface CustomerContractRepository extends JpaRepository<CustomerContract, Long> {

	Optional<CustomerContract> findById(int id);

}
