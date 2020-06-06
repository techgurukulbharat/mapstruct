package com.techgurukul.mapstruct.collection;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE)
public interface StudentMapperImmutable {

	
	StudentMapperImmutable INSTANCE = Mappers.getMapper(StudentMapperImmutable.class);

	StudentImmutableDTO studentToStudentImmutableDTO(Student student);

	void updateStudentImmutableDTO(Student student, @MappingTarget StudentImmutableDTO studentDTO);

	// Below two methods will give error as we can not update the existing collection
	
	//StudentImmutableDTOWithOutSetter studentToStudentImmutableDTOWithOutSetter(Student student);

	//void updateStudentImmutableDTOWithOutSetter(Student student, @MappingTarget StudentImmutableDTOWithOutSetter studentDTO);
}
