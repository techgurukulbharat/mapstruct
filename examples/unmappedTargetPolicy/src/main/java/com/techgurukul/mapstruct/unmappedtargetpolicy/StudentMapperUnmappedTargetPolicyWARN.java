package com.techgurukul.mapstruct.unmappedtargetpolicy;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface StudentMapperUnmappedTargetPolicyWARN {
	StudentMapperUnmappedTargetPolicyWARN INSTANCE = Mappers.getMapper(StudentMapperUnmappedTargetPolicyWARN.class);

	StudentDTO convertStudentToStudentDTO(Student student);
}
