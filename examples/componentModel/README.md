# MapStruct componentModel processor configuration

In this project the default componentModel is **spring** in POM.xml file.

```xml
<compilerArgs>
	<compilerArg>
		-Amapstruct.defaultComponentModel=spring
	</compilerArg>
</compilerArgs>
```

StudentMapperSpringComponent mapper interface using default componentModel **spring** defined in pom.xml

StudentMapperDefaultComponent mapper interface overridden  defaultComponentModel **spring**  using @Mapper annotation to **default** level.
> @Mapper(componentModel = "default")
