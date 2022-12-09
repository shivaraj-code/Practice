package com.emr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emr.model.Class;
import com.emr.repository.ClassRepository;
@Service
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	ClassRepository classRepository;

	@Override
	public Class createclass(Class classrequest) {
		// TODO Auto-generated method stub
		return classRepository.save(classrequest);
	}
	
	
}
