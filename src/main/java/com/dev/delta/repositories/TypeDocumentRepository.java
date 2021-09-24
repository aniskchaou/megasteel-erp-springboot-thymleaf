package com.dev.delta.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.TypeDocument;

public interface TypeDocumentRepository extends JpaRepository<TypeDocument, Long> {

	Optional<TypeDocument> findById(int id);

}
