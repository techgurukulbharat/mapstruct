package com.techgurukul.mapstruct.componentmodel;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.componentmodel.Student;
import com.techgurukul.mapstruct.componentmodel.StudentDTO;
import com.techgurukul.mapstruct.componentmodel.StudentMapperDefaultComponent;

public class StudentMapperDefaultComponentTest {

	@Test
	public void testConvertStudentToStudentDTO() {
		Student student = new Student("Test", 12345, "test@test.com");
		StudentDTO studentDTO = StudentMapperDefaultComponent.INSTANCE.convertStudentToStudentDTO(student );
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getRollNumber().equals(studentDTO.getRollNumber()));
		assertTrue(student.getEmail().equals(studentDTO.getEmail()));
	}

}
