package com.techgurukul.mapstruct.multisourcemapping;

public class Address {

	private String houseNo;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public Address(String houseNo) {
		super();
		this.houseNo = houseNo;
	}
	
}
