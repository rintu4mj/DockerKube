package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fetch")
public class DockerController {

	
	
	@GetMapping("/")
	public String home() {

		return "Welcome to Microservice Home  --->  use /findSector/{id}  to get the sector name";

	}
	
	@GetMapping("/test")
	public String test() {

		return "***MAIN-SERVICE*** -----> ***FETCH-SERVICE*** : Microservice Connection Successful ";

	}


}
