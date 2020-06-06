package com.techgurukul.mapstruct.datatypechangemapping;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.datatypechangemapping.Section;
import com.techgurukul.mapstruct.datatypechangemapping.Student;
import com.techgurukul.mapstruct.datatypechangemapping.StudentDTO;
import com.techgurukul.mapstruct.datatypechangemapping.StudentMapper;

public class StudentMapperTest {

	@Test
	public void testConvertStudentToStudentDTO() {
		Calendar cal = Calendar.getInstance();
		cal.set(1987, 01, 01, 0, 0, 0);
		LocalDateTime admisionDate = LocalDateTime.of(1991, 9, 01, 14, 30, 0);
		Student student = new Student("test", 1234, "test@test.com", "21", Section.A, cal,
				admisionDate, new BigInteger("20000"));

		StudentDTO studentDTO = StudentMapper.INSTANCE.convertStudentToStudentDTO(student);
		assertTrue(studentDTO.getRollNumber().equals(Integer.valueOf(student.getRollNumber())));
		assertTrue(studentDTO.getAge().equals(Integer.valueOf(student.getAge())));
		assertTrue(studentDTO.getSection().equals(student.getSection().toString()));
		assertTrue(studentDTO.getDateOfBirth().getTime() == student.getDateOfBirth().getTimeInMillis());
		assertTrue(studentDTO.getAdmissionDate()
				.equals(student.getAdmissionDate().toLocalDate().format(DateTimeFormatter.ISO_DATE)));
		assertTrue(studentDTO.getAdmissionFee().equals("2E4"));
	}
}