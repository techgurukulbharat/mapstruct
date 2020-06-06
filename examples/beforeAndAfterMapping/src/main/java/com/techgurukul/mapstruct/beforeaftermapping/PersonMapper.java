package com.techgurukul.mapstruct.beforeaftermapping;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonMapper {

	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

	@BeforeMapping
	public default void updatePersonType(Person person, @MappingTarget PersonDto personDto) {

		if (person instanceof Student) {
			personDto.setPersonType("St");
		} else if (person instanceof Teacher) {
			personDto.setPersonType("Tc");
		}
	}

	@AfterMapping
	public default void updateFullName(Person person, @MappingTarget PersonDto personDto) {
		personDto.setFullName(personDto.getFirtName() + " " + personDto.getLastName());
	}

	public PersonDto personToPersonDto(Person person);
}
