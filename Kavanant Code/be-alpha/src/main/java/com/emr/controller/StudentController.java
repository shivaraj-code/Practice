package com.emr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emr.model.Student;
import com.emr.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping("/studentwelcome")
	public String nitin() {
		return "Welcome to MY World..Student..";
	}

	@PostMapping("/student/add")
	public ResponseEntity<String> createstudent(@RequestBody Student strequest) {

		Student stu = studentService.createstudent(strequest);
		
		return ResponseEntity.status(201).body("Students Record created successfully with student Id"+stu.getStu_Id());
	}
}
