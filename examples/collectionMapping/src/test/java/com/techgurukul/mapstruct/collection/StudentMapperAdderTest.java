package com.techgurukul.mapstruct.collection;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.collection.Student;
import com.techgurukul.mapstruct.collection.StudentAdderDTO;
import com.techgurukul.mapstruct.collection.StudentAdderDTOWithOutAdder;
import com.techgurukul.mapstruct.collection.StudentMapperAdder;

public class StudentMapperAdderTest {

	@Test
	public void test_StudentToStudentAdderDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentAdderDTO studentDTO = StudentMapperAdder.INSTANCE.studentToStudentAdderDTO(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getSubjects().size() == studentDTO.getSubjects().size());
	}

	@Test
	public void test_UpdateStudentAdderDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentAdderDTO studentDTO = new StudentAdderDTO("Test1", subjectList);
		StudentMapperAdder.INSTANCE.updateStudentAdderDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}

	@Test
	public void test_StudentToStudentAdderDTOWithOutAdder() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentAdderDTOWithOutAdder studentDTO = StudentMapperAdder.INSTANCE
				.studentToStudentAdderDTOWithOutAdder(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertNull(studentDTO.getSubjects());
	}

	@Test
	public void test_UpdateStudentAdderDTOWithOutAdder() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentAdderDTOWithOutAdder studentDTO = new StudentAdderDTOWithOutAdder("Test1", subjectList);
		StudentMapperAdder.INSTANCE.updateStudentAdderDTOWithOutAdder(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}
}
