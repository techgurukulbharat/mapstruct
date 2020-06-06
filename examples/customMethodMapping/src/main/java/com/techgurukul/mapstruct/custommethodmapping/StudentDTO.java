package com.techgurukul.mapstruct.custommethodmapping;

import java.util.List;

public class StudentDTO {

	private String name;
	private Integer rollNumber;
	private String email;
	private List<String> mobileNumbers;
	private List<String> parentMobileNumbers;

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

	public StudentDTO(String name, Integer rollNumber, String email) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.email = email;
	}

	public List<String> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public List<String> getParentMobileNumbers() {
		return parentMobileNumbers;
	}

	public void setParentMobileNumbers(List<String> parentMobileNumbers) {
		this.parentMobileNumbers = parentMobileNumbers;
	}

	public StudentDTO() {
		super();
	}

}
