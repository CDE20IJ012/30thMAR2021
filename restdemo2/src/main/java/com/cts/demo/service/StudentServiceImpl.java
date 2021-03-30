
package com.cts.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.dao.StudentDAO;
import com.cts.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

   @Autowired	
   private StudentDAO studentDAO;
	
	@Override
	public List<Student> getAllStrudents() {
		// TODO Auto-generated method stub
		return studentDAO.getAllStudents();
	}

}
