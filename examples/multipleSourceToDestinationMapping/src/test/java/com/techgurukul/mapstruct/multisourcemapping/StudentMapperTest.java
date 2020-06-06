package com.techgurukul.mapstruct.multisourcemapping;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.multisourcemapping.Address;
import com.techgurukul.mapstruct.multisourcemapping.Student;
import com.techgurukul.mapstruct.multisourcemapping.StudentDTO;
import com.techgurukul.mapstruct.multisourcemapping.StudentMapper;

public class StudentMapperTest {

	@Test
	public void testConvertStudentToStudentDTO() {
		Student student = new Student("Test", 1234, "test@test.com");
		Address address = new Address("49");
		StudentDTO studentDTO = StudentMapper.INSTANCE.getStudentDTOByStudentAndAddress(student, address, 21);
		assertTrue(student.getName().equals(studentDTO.getName()));
		assertTrue(address.getHouseNo().equals(studentDTO.getHouseNo()));
		assertTrue(studentDTO.getAge().equals(Integer.valueOf(21)));
	}

}
