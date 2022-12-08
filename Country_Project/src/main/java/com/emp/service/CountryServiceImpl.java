package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emp.entity.Country;
import com.emp.repository.CountryRepository;

public class CountryServiceImpl implements CountryService{

	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public Country createCountry(Country request) {
		// TODO Auto-generated method stub
		return countryRepository.save(request);
	}

	@Override
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

	@Override
	public Country getCountryById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Country getCountryById(Integer country_Id) {
		// TODO Auto-generated method stub
		return countryRepository.findById(country_Id).get();
	}

	

	

}
