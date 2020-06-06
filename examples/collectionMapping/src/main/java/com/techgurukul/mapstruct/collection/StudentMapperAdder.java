package com.techgurukul.mapstruct.collection;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface StudentMapperAdder {

	StudentMapperAdder INSTANCE = Mappers.getMapper(StudentMapperAdder.class);

	StudentAdderDTO studentToStudentAdderDTO(Student student);

	void updateStudentAdderDTO(Student student, @MappingTarget StudentAdderDTO studentDTO);

	StudentAdderDTOWithOutAdder studentToStudentAdderDTOWithOutAdder(Student student);

	void updateStudentAdderDTOWithOutAdder(Student student, @MappingTarget StudentAdderDTOWithOutAdder studentDTO);
}
