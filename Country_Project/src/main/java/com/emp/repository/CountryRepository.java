package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
