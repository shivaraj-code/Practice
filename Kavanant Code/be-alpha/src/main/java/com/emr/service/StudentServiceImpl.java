package com.emr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.model.Student;
import com.emr.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student createstudent(Student strequest) {
		// TODO Auto-generated method stub
		return studentRepository.save(strequest);
	}
	
	
	
}
