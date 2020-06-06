package com.techgurukul.mapstruct.simplemapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	 StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	StudentDTO convertStudentToStudentDTO(Student student);
}
