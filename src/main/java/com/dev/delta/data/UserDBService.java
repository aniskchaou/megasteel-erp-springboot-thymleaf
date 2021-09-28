package com.dev.delta.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.User;
import com.dev.delta.repositories.UserRepository;

@Service
public class UserDBService implements IDBService {

	@Autowired
	UserRepository userRepository;

	@Override
	public void populate() {
		User u = new User();
		u.setUsername("admin");
		u.setPassword("admin");
		userRepository.save(u);
	}

}
