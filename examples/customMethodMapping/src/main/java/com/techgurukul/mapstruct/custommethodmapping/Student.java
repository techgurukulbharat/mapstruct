package com.techgurukul.mapstruct.custommethodmapping;

import java.util.List;

public class Student {

	private String name;
	private Integer rollNumber;
	private String email;
	private List<Integer> mobileNumbers;
	private List<Integer> parentMobileNumbers;

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

	public Student(String name, Integer rollNumber, String email, List<Integer> mobileNumbers,
			List<Integer> parentMobileNumbers) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.email = email;
		this.mobileNumbers = mobileNumbers;
		this.parentMobileNumbers = parentMobileNumbers;
	}

	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public List<Integer> getParentMobileNumbers() {
		return parentMobileNumbers;
	}

	public void setParentMobileNumbers(List<Integer> parentMobileNumbers) {
		this.parentMobileNumbers = parentMobileNumbers;
	}

	public Student() {
		super();
	}

}
