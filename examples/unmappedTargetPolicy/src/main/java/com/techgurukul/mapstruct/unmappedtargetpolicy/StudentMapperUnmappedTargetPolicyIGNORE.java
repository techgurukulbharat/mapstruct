package com.techgurukul.mapstruct.unmappedtargetpolicy;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapperUnmappedTargetPolicyIGNORE {
	StudentMapperUnmappedTargetPolicyIGNORE INSTANCE = Mappers.getMapper(StudentMapperUnmappedTargetPolicyIGNORE.class);

	StudentDTO convertStudentToStudentDTO(Student student);
}
