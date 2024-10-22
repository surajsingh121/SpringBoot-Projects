package com.app;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Service service;
	
	@GetMapping("/data")
	public List<Student> getAllStudent() {
		 List<Student> studentData = service.getAllStudent();
		 return studentData;
	}
}
