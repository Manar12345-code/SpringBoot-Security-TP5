package com.example.manar.service;

import java.util.List;

import com.example.manar.entities.Role;
import com.example.manar.entities.User;

public interface UserService {

	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
	
	List<User> findAllUsers();
}
