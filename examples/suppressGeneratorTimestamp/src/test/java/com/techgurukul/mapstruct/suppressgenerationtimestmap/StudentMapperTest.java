package com.techgurukul.mapstruct.suppressgenerationtimestmap;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StudentMapperTest {

	@Test
	public void testConvertStudentToStudentDTO() {
		Student student = new Student("Test", 12345, "test@test.com");
		StudentDTO studentDTO = StudentMapper.INSTANCE.convertStudentToStudentDTO(student );
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getRollNumber().equals(studentDTO.getRollNumber()));
		assertTrue(student.getEmail().equals(studentDTO.getEmail()));
	}

}
