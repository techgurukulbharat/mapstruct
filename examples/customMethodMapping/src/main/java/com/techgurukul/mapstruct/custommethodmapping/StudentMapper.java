package com.techgurukul.mapstruct.custommethodmapping;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mapping(target = "parentMobileNumbers", qualifiedByName = "addZero")
	StudentDTO convertStudentToStudentDTO(Student student);

	default List<String> addCountryCode(List<Integer> mobileNumbers) {
		return mobileNumbers.stream().map(number -> "+91-" + number).collect(Collectors.toList());
	}
	
	@Named("addZero")
	default List<String> addZero(List<Integer> mobileNumbers) {
		return mobileNumbers.stream().map(number -> "0" + number).collect(Collectors.toList());
	}
}
