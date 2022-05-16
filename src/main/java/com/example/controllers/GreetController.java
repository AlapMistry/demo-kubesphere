package com.example.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GreetController {
	
	@GetMapping("/")
	public String greetHello(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return "Hello " + name + "!";
	}
}
