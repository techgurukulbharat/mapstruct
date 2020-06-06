package com.techgurukul.mapstruct.ignorefieldmapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mapping(target = "rollNumber", ignore = true)
	StudentDTO convertStudentToStudentDTO(Student student);
}
