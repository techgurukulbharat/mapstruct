package com.techgurukul.mapstruct.collection;

import java.util.List;

public class StudentAccessorDTO {

	private String name;
	private List<String> subjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubjects(List<String> subjects) {
		this.getSubjects().addAll(subjects);
	}

	public StudentAccessorDTO(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}

	public StudentAccessorDTO() {
		super();
	}
}
