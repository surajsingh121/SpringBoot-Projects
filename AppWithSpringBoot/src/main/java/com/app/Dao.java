package com.app;


import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	List<Student> studentData = Arrays.asList(new Student(1,"aman","aman12@gmail.com","ranchi"),
			new Student(2,"sagar","sagar123@gmail.com","Delhi"),
			new Student(3,"rahul","rahul12@gmail.com","Ranchi"),
			new Student(4,"ayesha","ayeshagmail.com","Noida"),
			new Student(5,"tanya","tanya12@gmail.com","Punjab"),
			new Student(6,"yudii","yudii12@gmail.com","Noida"));

	public List<Student> getAllStudent() {
		
		return studentData;
			}
	
}
