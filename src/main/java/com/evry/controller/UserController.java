package com.evry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	
	@GetMapping("/displayForm")
	public String showRegistrationForm() {
		return "register";
	}
}