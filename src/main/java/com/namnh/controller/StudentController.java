package com.namnh.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namnh.model.Student;

@RestController
public class StudentController {
	
	
	public Student createStudent(@RequestBody Student student)
	{
		return null;
	}
}
