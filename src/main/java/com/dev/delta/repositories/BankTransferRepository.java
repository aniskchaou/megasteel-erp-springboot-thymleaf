package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.BankTransfer;

public interface BankTransferRepository extends JpaRepository<BankTransfer, Long> {

	Optional<BankTransfer> findById(int id);

}
