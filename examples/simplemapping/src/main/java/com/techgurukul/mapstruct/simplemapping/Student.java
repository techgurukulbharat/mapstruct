package com.techgurukul.mapstruct.simplemapping;

public class Student {

	private String name;
	private Integer rollNumber;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String name, Integer rollNumber, String email) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.email = email;
	}
	
	public Student() {
		super();
	}

}
