package com.techgurukul.mapstruct.datatypechangemapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mapping(target = "admissionDate", dateFormat = "yyyy-MM-dd")
	@Mapping(target = "admissionFee", numberFormat = "#0.#E0")
	StudentDTO convertStudentToStudentDTO(Student student);
}
