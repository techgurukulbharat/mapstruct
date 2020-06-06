package com.techgurukul.mapstruct.componentmodel;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "default")
public interface StudentMapperDefaultComponent {

	StudentMapperDefaultComponent INSTANCE = Mappers.getMapper(StudentMapperDefaultComponent.class);
	StudentDTO convertStudentToStudentDTO(Student student);
}
