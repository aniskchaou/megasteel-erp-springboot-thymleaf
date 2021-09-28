package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.FamilyRepository;

@Service
public class FamilyDBService implements IDBService {

	@Autowired
	FamilyRepository FamilyRepository;

	@Override
	public void populate() {
		family.setArticleNumber("56");
		family.setMachineNumber("2");
		family.setName("spiral");
		FamilyRepository.save(family);

	}

}
