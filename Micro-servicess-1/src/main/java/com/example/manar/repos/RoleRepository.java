package com.example.manar.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manar.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);

}
