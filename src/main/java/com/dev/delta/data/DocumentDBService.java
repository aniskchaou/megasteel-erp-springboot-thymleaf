package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.DocumentRepository;

@Service
public class DocumentDBService implements IDBService {

	@Autowired
	DocumentRepository documentRepository;

	@Override
	public void populate() {
		document.setName(null);
		document.setType(typeDocument);

		documentRepository.save(document);
	}

}
