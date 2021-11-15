package com.example.manar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.manar.entities.User;
import com.example.manar.entities.Role;
import com.example.manar.service.UserService;



@SpringBootApplication
public class MicroServicess1Application {

	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroServicess1Application.class, args);
	}
	/*
	@PostConstruct
	void init_users() {
		// ajouter les rôles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));

		// ajouter les users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "manar", "123", true, null));
		userService.saveUser(new User(null, "nour", "123", true, null));

		// ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("manar", "USER");
		userService.addRoleToUser("nour", "USER");
	}*/

  
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

}
