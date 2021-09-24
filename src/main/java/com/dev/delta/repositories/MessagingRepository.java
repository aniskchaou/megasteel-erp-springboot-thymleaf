package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Messaging;

public interface MessagingRepository extends JpaRepository<Messaging, Long> {

}
