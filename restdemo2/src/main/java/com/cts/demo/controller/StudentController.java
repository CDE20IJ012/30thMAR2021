package com.cts.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.model.Student;
import com.cts.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> getAllStudents()
	{
		 return studentService.getAllStrudents();
	}
	
}
