package com.learn.java_githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/greet")
	public String greet(@RequestParam String name) {
		return "Hello, Welcome to the Tutorial "+name;
		
	}
}
