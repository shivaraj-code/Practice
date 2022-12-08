package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
