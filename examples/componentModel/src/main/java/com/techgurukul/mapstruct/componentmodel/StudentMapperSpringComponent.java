package com.techgurukul.mapstruct.componentmodel;

import org.mapstruct.Mapper;

@Mapper
public interface StudentMapperSpringComponent {
	StudentDTO convertStudentToStudentDTO(Student student);
}
