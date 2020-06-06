package com.techgurukul.mapstruct.differentfieldmapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mapping(source = "name", target = "firstName")
	StudentDTO convertStudentToStudentDTO(Student student);
}
