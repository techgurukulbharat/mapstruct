package com.techgurukul.mapstruct.collection;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED)
public interface StudentMapperSetter {

	StudentMapperSetter INSTANCE = Mappers.getMapper(StudentMapperSetter.class);

	StudentSetterDTO studentToStudentSetterDTO(Student student);

	void updateStudentSetterDTO(Student student, @MappingTarget StudentSetterDTO studentDTO);

	StudentSetterDTOWithOutSetter studentToStudentSetterDTOWithOutSetter(Student student);

	void updateStudentSetterDTOWithOutSetter(Student student, @MappingTarget StudentSetterDTOWithOutSetter studentDTO);
}
