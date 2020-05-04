package com.zensar.springinitializer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/")
	//@ResponseBody
	public String welcome() {
		return "<h2> Welcome to Spring Boot </h2>";
	}
	
	

}
