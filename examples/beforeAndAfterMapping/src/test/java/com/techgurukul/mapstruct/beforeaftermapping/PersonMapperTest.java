package com.techgurukul.mapstruct.beforeaftermapping;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.techgurukul.mapstruct.beforeaftermapping.PersonDto;
import com.techgurukul.mapstruct.beforeaftermapping.PersonMapper;
import com.techgurukul.mapstruct.beforeaftermapping.Student;
import com.techgurukul.mapstruct.beforeaftermapping.Teacher;

public class PersonMapperTest {

	@Test
	public void test_personToPersonDto_StudentMapping() {

		Student student = new Student();
		student.setFirtName("MapStruct");
		student.setLastName("Tutorial");
		PersonDto studentPersonDto = PersonMapper.INSTANCE.personToPersonDto(student);
		assertTrue(studentPersonDto.getFullName().equals("MapStruct Tutorial"));
		assertTrue(studentPersonDto.getPersonType().equals("St"));
		assertTrue(studentPersonDto.getFirtName().equals(student.getFirtName()));
		assertTrue(studentPersonDto.getLastName().equals(student.getLastName()));

	}

	@Test
	public void test_personToPersonDto_TeacherMapping() {

		Teacher teacher = new Teacher();
		teacher.setFirtName("MapStruct");
		teacher.setLastName("Tutorial");
		PersonDto teacherPersonDto = PersonMapper.INSTANCE.personToPersonDto(teacher);
		assertTrue(teacherPersonDto.getFullName().equals("MapStruct Tutorial"));
		assertTrue(teacherPersonDto.getPersonType().equals("Tc"));
		assertTrue(teacherPersonDto.getFirtName().equals(teacher.getFirtName()));
		assertTrue(teacherPersonDto.getLastName().equals(teacher.getLastName()));

	}

}
