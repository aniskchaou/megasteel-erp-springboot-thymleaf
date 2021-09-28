package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.DocumentRepository;
import com.dev.delta.repositories.TypeDocumentRepository;

@Service
public class DocumentTypeDbService implements IDBService {

	@Autowired
	TypeDocumentRepository documentRepository;

	@Override
	public void populate() {

		typeDocument.setDescription("");
		typeDocument.setExtension("doc");
		typeDocument.setName("word");
		documentRepository.save(typeDocument);
	}

}
