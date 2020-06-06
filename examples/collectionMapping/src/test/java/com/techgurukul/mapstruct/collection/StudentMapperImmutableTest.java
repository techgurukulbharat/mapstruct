package com.techgurukul.mapstruct.collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.collection.Student;
import com.techgurukul.mapstruct.collection.StudentImmutableDTO;
import com.techgurukul.mapstruct.collection.StudentMapperImmutable;

public class StudentMapperImmutableTest {

	@Test
	public void test_StudentToStudentImmutableDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		StudentImmutableDTO studentDTO = StudentMapperImmutable.INSTANCE.studentToStudentImmutableDTO(student);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getSubjects().size() == studentDTO.getSubjects().size());
	}

	@Test
	public void test_UpdateStudentImmutableDTO() {
		Student student = new Student("Test", List.of("HINDI", "MATH"));
		List<String> subjectList = new ArrayList<>();
		subjectList.add("SCIENCE");
		StudentImmutableDTO studentDTO = new StudentImmutableDTO("Test1", subjectList);
		StudentMapperImmutable.INSTANCE.updateStudentImmutableDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals(student.getName()));
		assertTrue(studentDTO.getSubjects().contains("HINDI"));
		assertTrue(studentDTO.getSubjects().size() == 2);
	}

}
