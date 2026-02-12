package com.doctor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the doctor Application";
	}

	@GetMapping
	public String signUp() {
		return "please login";
	}
}
