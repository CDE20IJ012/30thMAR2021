package com.cts.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.demo.model.Student;


@Repository
public class StudentDAOImpl implements StudentDAO {

	@Override
	public List<Student> getAllStudents() {

		  List<Student> students=new ArrayList<>();
		  Student student1=new Student();
		  student1.setRoll(1);
		  student1.setName("Ravi");
          student1.setMarks(80);
          Student student2=new Student();
		  student2.setRoll(2);
		  student2.setName("Zavier");
          student2.setMarks(100);
          Student student3=new Student();
		  student3.setRoll(3);
		  student3.setName("Suresh");
          student3.setMarks(90);
	      students.add(student1);
	      students.add(student2);
	      students.add(student3);
	      return students;
	}

}
