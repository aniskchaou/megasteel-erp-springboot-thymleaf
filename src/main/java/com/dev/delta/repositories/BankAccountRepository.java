package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

	Optional<BankAccount> findById(int id);

}
