package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

	Optional<Document> findById(int id);

}
