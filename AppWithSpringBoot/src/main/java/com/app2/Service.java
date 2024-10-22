package com.app2;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao dao;
	
	public List<Patients> getAllPatients() throws ClassNotFoundException, SQLException {
		List<Patients> patients = dao.getAllPatients();
		return patients;
	}
	
	
	public String insertPatients(Patients patients) throws SQLException{
		
		String message = dao.insertPateints(patients);
		
		return message;
	}

}
