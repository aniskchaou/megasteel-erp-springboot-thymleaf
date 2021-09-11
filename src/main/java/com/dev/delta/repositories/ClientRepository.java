package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	Optional<Client> findById(int id);

}
