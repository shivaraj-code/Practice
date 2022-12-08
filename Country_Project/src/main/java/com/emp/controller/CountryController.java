package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Country;
import com.emp.service.CountryService;

@RestController
class CountryController {
	
	@Autowired
	CountryService countryService;

	@RequestMapping("/country")
	public String vijay() {
		return "Welcome to MY World Country_Controller...";
	}

	@PostMapping("/country/add")
	public ResponseEntity<String> createCountry(@RequestBody Country request) {
		Country country =countryService.createCountry(request);
		return ResponseEntity.status(201).body("Country Details Created Successfully...");
	}
	
	@GetMapping("/country/list")
	public List<Country> getCountry(){
		return countryService.getCountry();
	}
	
	@GetMapping("/country/list/{country_Id}")
	public Country getCountryById(@PathVariable Country Integer) {
		return countryService.getCountryById();
	}
	
	
}
