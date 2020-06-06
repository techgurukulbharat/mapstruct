# MapStruct unmappedTargetPolicy processor configuration

In this project unmappedTargetPolicy is **IGNORE** in POM.xml file.

```xml
<compilerArgs>
	<compilerArg>
		-Amapstruct.unmappedTargetPolicy=IGNORE
	</compilerArg>
</compilerArgs>
```

StudentMapperUnmappedTargetPolicyIGNORE mapper interface using default unmappedTargetPolicy **WARN** defined in pom.xml

StudentMapperUnmappedTargetPolicyWARN mapper interface overridden  unmappedTargetPolicy **IGNORE**  using @Mapper annotation to **WARN** level.

> @Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)

Here you can see both mapper interfaces are exactly same, but for StudentMapperUnmappedTargetPolicyWARN it is showing below warning as we have override unmappedTargetPolicy from IGNORE to WARN.
> Unmapped target property: "mobileNumber".
