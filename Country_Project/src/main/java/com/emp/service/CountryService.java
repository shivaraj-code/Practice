package com.emp.service;

import java.util.List;

import com.emp.entity.Country;

public interface CountryService {

	Country createCountry(Country request);
	List<Country> getCountry();
	Country getCountryById();
	Country getCountryById(Integer country_Id);

}
