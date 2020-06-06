package com.techgurukul.mapstruct.updatemapping;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StudentMapperTest {

	@Test
	public void test_updateStudentDTO() {
		Student student = new Student("test1", "student@test.com");
		StudentDTO studentDTO = new StudentDTO("test2", 12345, "studentDTO@test.com");
		StudentMapper.INSTANCE.updateStudentDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals("test2"));
		assertTrue(studentDTO.getRollNumber().equals(12345));
		assertTrue(studentDTO.getEmail().equals(student.getEmail()));//"student@test.com"
	}
	
	
	@Test
	public void test_updateAndRetrunStudentDTO() {
		Student student = new Student("test1", "student@test.com");
		StudentDTO studentDTO = new StudentDTO("test2", 12345, "studentDTO@test.com");
		StudentMapper.INSTANCE.updateStudentDTO(student, studentDTO);
		assertTrue(studentDTO.getName().equals("test2"));
		assertTrue(studentDTO.getRollNumber().equals(12345));
		assertTrue(studentDTO.getEmail().equals(student.getEmail()));//"student@test.com"
	}

}
