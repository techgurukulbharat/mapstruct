package com.techgurukul.mapstruct.datatypechangemapping;

import java.util.Date;

public class StudentDTO {

	private String name;
	private Integer rollNumber;
	private String email;
	private Integer age;
	private String section;
	private Date dateOfBirth;
	private String admissionDate;
	private String admissionFee;
	
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}

}
