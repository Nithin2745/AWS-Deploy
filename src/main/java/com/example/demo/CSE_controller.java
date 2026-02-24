package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSE_controller {
	@GetMapping("/home")
	public String Dis() {
		return "Welcome to CSE Jenkins";
	}
	@GetMapping("/cse")
	public String Dis2() {
		return "Welcome to Aditya University";
	}
}
