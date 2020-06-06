package com.techgurukul.mapstruct.unmappedtargetpolicy;

public class StudentDTO {

	private String name;
	private Integer rollNumber;
	private String email;
	private String mobileNumber;
	
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public StudentDTO(String name, Integer rollNumber, String email) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.email = email;
	}

	public StudentDTO() {
		super();
	}

}
