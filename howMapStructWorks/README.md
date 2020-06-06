# How MapStruct works?

To understand how MapStruct works internally you need to have understanding of [Java annotation processor tool (JAPT)](https://docs.oracle.com/javase/6/docs/technotes/guides/apt/index.html)

Basically JAPT is a way to generate java source files during the **compilation** time. Its works on annotation and create new files based on that.

MapStruct is actually JAPT only which create new files based on annotations. In MapStrtuct you have to define a interface(With **@Mapper** annotation) which declares any required mapping methods. During **compilation**, MapStruct will generate an implementation of this interface. This implementation uses plain Java method invocations for mapping between source and target objects.

**Note: Just remember one thing that MapStruct generates code at compile time.**



Now we have baisc understanding of MapStruct so let's start playing with it [>>](../MapStructSetUp#how-to-use-mapstruct)
