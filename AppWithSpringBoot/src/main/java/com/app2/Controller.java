package com.app2;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	@GetMapping("/patient")
	public List<Patients> getAllPatients() throws ClassNotFoundException, SQLException {
		
		List<Patients> patients = service.getAllPatients();
		return patients;
		
	}
	
	
	@PostMapping("/patient")
	public String insertPatients(@RequestBody Patients patients) throws SQLException {
		
		String message = service.insertPatients(patients);
		
		return message;
	}

}
