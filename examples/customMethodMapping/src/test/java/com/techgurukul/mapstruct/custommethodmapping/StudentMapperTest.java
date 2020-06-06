package com.techgurukul.mapstruct.custommethodmapping;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.custommethodmapping.Student;
import com.techgurukul.mapstruct.custommethodmapping.StudentDTO;
import com.techgurukul.mapstruct.custommethodmapping.StudentMapper;

public class StudentMapperTest {

	@Test
	public void testConvertStudentToStudentDTO() {
		Student student = new Student("Test", 12345, "test@test.com",List.of(1234567890), List.of(987654321));
		StudentDTO studentDTO = StudentMapper.INSTANCE.convertStudentToStudentDTO(student );
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(student.getRollNumber().equals(studentDTO.getRollNumber()));
		assertTrue(student.getEmail().equals(studentDTO.getEmail()));
		assertTrue(("+91-"+student.getMobileNumbers().get(0)).equals(studentDTO.getMobileNumbers().get(0)));
		assertTrue(("0"+student.getParentMobileNumbers().get(0)).equals(studentDTO.getParentMobileNumbers().get(0)));
	}

}
