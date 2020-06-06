
# How to use MapStruct?
While writing this tutorial i used below technologies:
- Java 11.0.2
- Maven 3
- junit-jupiter 5.6.2
- MapStruct 1.3.1.Final

Editor: Eclipse IDE for Enterprise Java Developers 

Plese follow below steps to use MapStruct in maven project.

Steps:

* Add the mapstruct library as a dependency in pom file
```xml
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>1.3.1.Final</version>
</dependency>



```
* Add mapstruct-processor in pom file:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.6.2</version>
            <configuration>
                <source>11</source>
                <target>11</target>
                <annotationProcessorPaths>
                    <path>
                        <groupId>org.mapstruct</groupId>
                        <artifactId>mapstruct-processor</artifactId>
                        <version>1.3.1.Final</version>
                    </path>
                </annotationProcessorPaths>
            </configuration>
        </plugin>
    </plugins>
</build>
```

* Install [M2E plug-in](http://www.eclipse.org/m2e/) in eclipse.

* In eclipse go to "Preferences" → "Maven" → "Annotation Processing" and select "Automatically configure JDT APT".


Check some more [configuration](../configuration/config.md#mapstruct-processor-configuration)  

You can check sample project from [Examples](../examples).
