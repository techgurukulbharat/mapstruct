package com.techgurukul.mapstruct.updatemapping;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	 StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	 void updateStudentDTO(Student student, @MappingTarget StudentDTO studentDTO);
	 
	 StudentDTO updateAndRetrunStudentDTO(Student student, @MappingTarget StudentDTO studentDTO);
}
