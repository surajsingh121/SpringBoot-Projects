package com.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Dao dao;
	ArrayList<Student> filterStudentData = new ArrayList<>();
	
	public List<Student> getAllStudent() {
		List<Student> studentData =dao.getAllStudent();
		for(Student student : studentData) {
			if(student.getAddress().equals("Noida")) {
				filterStudentData.add(student);
			}
		}
		return filterStudentData;
	}
	
}
