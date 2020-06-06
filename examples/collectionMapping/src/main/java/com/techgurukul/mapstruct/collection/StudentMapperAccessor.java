package com.techgurukul.mapstruct.collection;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapperAccessor {
	StudentMapperAccessor INSTANCE = Mappers.getMapper(StudentMapperAccessor.class);

	StudentAccessorDTO studentToStudentAccessorDTO(Student student);

	void updateStudentDTO(Student student, @MappingTarget StudentAccessorDTO studentDTO);

	StudentAccessorDTOWithOutSetter studentToStudentAccessorDTOWithOutSetter(Student student);

	void updateStudentAccessorDTOWithOutSetter(Student student, @MappingTarget StudentAccessorDTOWithOutSetter studentDTO);
}
