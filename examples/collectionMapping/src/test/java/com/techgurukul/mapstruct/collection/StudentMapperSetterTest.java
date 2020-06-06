package com.techgurukul.mapstruct.collection;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.collection.Student;
import com.techgurukul.mapstruct.collection.StudentMapperSetter;
import com.techgurukul.mapstruct.collection.StudentSetterDTO;
import com.techgurukul.mapstruct.collection.StudentSetterDTOWithOutSetter;

public class StudentMapperSetterTest {

	@Test
	public void test_StudentToStudentSetterDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentSetterDTO studentDTO = StudentMapperSetter.INSTANCE.studentToStudentSetterDTO(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getSubjects().size() == studentDTO.getSubjects().size());
	}

	@Test
	public void test_UpdateStudentSetterDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentSetterDTO studentDTO = new StudentSetterDTO("Test1", subjectList);
		StudentMapperSetter.INSTANCE.updateStudentSetterDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}

	@Test
	public void test_StudentToStudentSetterDTOWithOutSetter() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentSetterDTOWithOutSetter studentDTO = StudentMapperSetter.INSTANCE
				.studentToStudentSetterDTOWithOutSetter(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertNull(studentDTO.getSubjects());
	}

	@Test
	public void test_UpdateStudentSetterDTOWithOutSetter() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentSetterDTOWithOutSetter studentDTO = new StudentSetterDTOWithOutSetter("Test1", subjectList);
		StudentMapperSetter.INSTANCE.updateStudentSetterDTOWithOutSetter(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}
}
