package com.example.manar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manar.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
