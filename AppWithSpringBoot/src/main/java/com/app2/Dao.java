package com.app2;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class Dao {
	
	
	ArrayList<Patients> patient = new ArrayList<>();
	
	public List<Patients> getAllPatients() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DBConnection.DbConnection();
		Statement st =connection.createStatement();
		ResultSet rs =st.executeQuery("select * from patients");
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String gender = rs.getString("gender");
			
			Patients patients = new Patients(id,name,age,gender);
			patient.add(patients);
		}
		return patient;
	}
	
	public String insertPateints(Patients patients) throws SQLException {
		
		Connection connection = DBConnection.DbConnection();
		PreparedStatement pst = connection.prepareStatement("insert into patients values(?,?,?,?)");
		pst.setInt(1, patients.getId());
		pst.setString(2,patients.getName());
		pst.setInt(3, patients.getAge());
		pst.setString(4, patients.getGender());
		
		pst.executeUpdate();
		
		return "Updated successfully";
		
	}

}
