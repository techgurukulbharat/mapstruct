## Custom Mapping using @BeforeMapping and @AfterMapping Annotations

As we discussed [custom Mapping](https://github.com/pawan-lnmiit/mapstruct/tree/master/examples/customMethodMapping) where I explained how we can give custom methods for an specific mapping from one type to another which can’t be generated automatically by MapStruct.

Now there are some scenario where we want to apply some logic before and after mapping logic. This is very useful when we want to apply some custom logic not only for a few selected methods, but for all methods that map specific super-types. 

Let's understand this through a very simple example: In below example we want to add personType and fullName while mapping Person to PersonDTO but as you can see Person class doesn't have personType and fullName, also personType depends on whether its Student or Teacher object. This can be handled very easily through @BeforeMapping and @AfterMapping Annotations.

```java
public class Person {
	String firtName;
	String lastName;
}

public class Student extends Person {

}

public class Teacher extends Person {

}
public class PersonDto {
	String firtName;
	String lastName;
	String personType;
	String fullName;
}
```

Let's see the Mapper interface for Person to PersonDTO

```java
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
```

Here is generated code by MapStruct:

```java
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDto personToPersonDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();

        updatePersonType( person, personDto );

        personDto.setFirtName( person.getFirtName() );
        personDto.setLastName( person.getLastName() );

        updateFullName( person, personDto );

        return personDto;
    }
}
````
You can see MapStruct added @BeforeMapping code before mapping started and @AfterMapping once all mapping done.
For sample code please check the attached src folder.
