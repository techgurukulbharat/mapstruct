#### Collection mappings

In MapStruct, Java collections mapping works as normal attributes mapping. The only thing which is different in Java Collections is the CollectionMappingStrateg, with the possible values: ACCESSOR_ONLY, SETTER_PREFERRED, ADDER_PREFERRED and TARGET_IMMUTABLE. Default CollectionMappingStrateg is ACCESSOR_ONLY.


Default CollectionMappingStrateg can be changed through @MapperConfig annotation in configuration class like @MapperConfig(collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED) and for an specific Mapper class it can be changed through  @Mapper annotation like  @Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED).

Each CollectionMapping strategy follow fix pattern in order to propagate the value in target property:

1] **ACCESSOR_ONLY**: This strategy first checks Setter and if not available then getter used to propagate value. In case of both setter and getter not available then target property won't be propagated at all.

**Note**: If target have setter method then target property will always be initialized, mean it won't append collection to existing collection of target property.

2] **SETTER_PREFERRED**: As name implies it first check Setter and if not available then will give first priority to adder  and then getter method. 
 
3] **ADDER_PREFERRED**:	As name implies it first check Adder and if not available then will give first priority to setter  and then getter method.

4] **TARGET_IMMUTABLE**:	 As name implies the target collection is immutable means we can not update(cleared and addAll) in case of existing bean instances. Instead the target accessor methods like setXXXXX, will be used on the target collection.

**Note** In case of no accessor method like setXXXXX etc, Mapper class will throw error.


Please check example in project corresponding to each strategy for more information. 