package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
