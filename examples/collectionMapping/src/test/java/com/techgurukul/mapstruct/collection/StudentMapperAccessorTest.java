package com.techgurukul.mapstruct.collection;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.collection.Student;
import com.techgurukul.mapstruct.collection.StudentAccessorDTO;
import com.techgurukul.mapstruct.collection.StudentMapperAccessor;

public class StudentMapperAccessorTest {

	@Test
	public void test_StudentToStudentAccessorDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentAccessorDTO studentDTO = StudentMapperAccessor.INSTANCE.studentToStudentAccessorDTO(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getSubjects().size() == studentDTO.getSubjects().size());
	}

	@Test
	public void test_UpdateStudentAccessorDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentAccessorDTO studentDTO = new StudentAccessorDTO("Test1", subjectList);
		StudentMapperAccessor.INSTANCE.updateStudentDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}
	
	@Test
	public void test_StudentToStudentAccessorDTOWithOutSetter() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentAccessorDTO studentDTO = StudentMapperAccessor.INSTANCE.studentToStudentAccessorDTO(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getSubjects().size() == studentDTO.getSubjects().size());
	}

	@Test
	public void test_UpdateStudentAccessorDTOWithOutSetter() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentAccessorDTO studentDTO = new StudentAccessorDTO("Test1", subjectList);
		StudentMapperAccessor.INSTANCE.updateStudentDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}
}
