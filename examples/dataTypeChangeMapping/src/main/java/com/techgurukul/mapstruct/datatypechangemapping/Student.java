package com.techgurukul.mapstruct.datatypechangemapping;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Student {

	private String name;
	private int rollNumber;
	private String email;
	private String age;
	private Section section;
	private Calendar dateOfBirth;
	private LocalDateTime admissionDate;
	private BigInteger admissionFee;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDateTime admissionDate) {
		this.admissionDate = admissionDate;
	}

	public BigInteger getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(BigInteger admissionFee) {
		this.admissionFee = admissionFee;
	}

	public Student() {
		super();
	}

	public Student(String name, int rollNumber, String email, String age, Section section,
			Calendar dateOfBirth, LocalDateTime admissionDate, BigInteger admissionFee) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.email = email;
		this.age = age;
		this.section = section;
		this.dateOfBirth = dateOfBirth;
		this.admissionDate = admissionDate;
		this.admissionFee = admissionFee;
	}

}
