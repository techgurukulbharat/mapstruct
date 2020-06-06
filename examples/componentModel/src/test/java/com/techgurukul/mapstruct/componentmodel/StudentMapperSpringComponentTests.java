package com.techgurukul.mapstruct.componentmodel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.techgurukul.mapstruct.componentmodel.Student;
import com.techgurukul.mapstruct.componentmodel.StudentDTO;
import com.techgurukul.mapstruct.componentmodel.StudentMapperSpringComponent;

@SpringBootTest
class StudentMapperSpringComponentTests {

	@Autowired
	private StudentMapperSpringComponent studentMapper;
	
	@Test
	void test_convertStudentToStudentDTO() {
	
		Student student = new Student("Test", 12345, "test@test.com");
		StudentDTO studentDTO = studentMapper.convertStudentToStudentDTO(student );
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getRollNumber().equals(studentDTO.getRollNumber()));
		assertTrue(student.getEmail().equals(studentDTO.getEmail()));
	
	}

}
