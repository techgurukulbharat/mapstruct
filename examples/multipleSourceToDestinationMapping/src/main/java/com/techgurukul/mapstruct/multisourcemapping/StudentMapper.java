package com.techgurukul.mapstruct.multisourcemapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mapping(source = "student.name", target = "name")
	@Mapping(source = "address.houseNo", target = "houseNo")
	StudentDTO getStudentDTOByStudentAndAddress(Student student, Address address, Integer age);

}
