package com.techgurukul.mapstruct.multisourcemapping;

public class StudentDTO {

	private String name;
	private String houseNo;
	private Integer age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public StudentDTO() {
		super();
	}

}
