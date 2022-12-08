package com.emp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {
	
	
	@RequestMapping("/state")
	public String navin() {
		return "Welcome to MY World State_Controller..";
	}
}
