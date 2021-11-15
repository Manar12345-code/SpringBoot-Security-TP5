package com.example.manar.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.manar.entities.User;
import com.example.manar.repos.UserRepository;
import com.example.manar.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
@Autowired
UserService userRep;
@RequestMapping(path = "all",method = RequestMethod.GET)
public List<User> getAllUsers() {
return userRep.findAllUsers();
}
}