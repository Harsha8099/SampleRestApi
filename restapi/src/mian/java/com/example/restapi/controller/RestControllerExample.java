package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	@GetMapping("/")
	public int getName() {
		return 123;
	}
}
