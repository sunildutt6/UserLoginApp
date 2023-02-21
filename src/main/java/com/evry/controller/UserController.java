package com.evry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evry.entity.User;
import com.evry.service.UserService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://userlogin-omega.vercel.app")
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	UserService service;

	// getting all users
	@GetMapping("/users")
	public List<User> getUsers() {
		return service.getAllUsers();
	}

	// getting user based with their id
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUserById(id);
	}

	// creating new user
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	// updating the users with id variable
	@PutMapping("/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id) {
		return service.updateUser(id, user);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUserById(id);
	}

}