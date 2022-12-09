package com.emr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emr.model.Class;
import com.emr.service.ClassService;

@RestController
public class ClassController {

	@Autowired
	ClassService calssService;

	@RequestMapping("/classwelcome")
	public String navin() {
		return "Welcome to MY World..Class..";
	}

	@PostMapping("/class/add")
	public ResponseEntity<String> createclass(@RequestBody Class classrequest) {

		Class cls = calssService.createclass(classrequest);

		return ResponseEntity.status(201).body("Classes Record created successfully with class Id"+cls.getClass_Id());
	}

}
