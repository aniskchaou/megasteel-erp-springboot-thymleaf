package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.PaySlip;

public interface PaySlipRepository extends JpaRepository<PaySlip, Long> {

	Optional<PaySlip> findById(int id);

}
