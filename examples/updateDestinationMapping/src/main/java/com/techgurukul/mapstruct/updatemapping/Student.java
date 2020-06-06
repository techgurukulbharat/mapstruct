package com.techgurukul.mapstruct.updatemapping;

public class Student {

	private String email;
	private String fullName;

	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Student(String fullName, String email) {
		super();
		this.fullName = fullName;
		this.email = email;
	}
	
	public Student() {
		super();
	}

}
