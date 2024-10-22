package com.app2;

public class Patients {
	
	private int id ;
	private String name ;
	private int age ;
	private String gender ;
	
	Patients(int id, String name, int age, String gender){
		this.id = id;
		this.name = name ;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
