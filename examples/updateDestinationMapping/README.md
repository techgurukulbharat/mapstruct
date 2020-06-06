#### Update existing destination object 

This is one of very common scenario, where you have a target object and you just want to update it through source object.
In MapStruct this can be achieved through marking the target object parameter with @MappingTarget annotation.
MapStruct allow to mark only one parameter with @MappingTarget annotation.

Check the project where target object's email is updated with source object's email.

![mapperClass](https://github.com/pawan-lnmiit/mapstruct/blob/master/examples/updateDestinationMapping/updateExistingObject.png)
