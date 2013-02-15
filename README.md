Injecting Spring beans into POSOs and POGOs
=========================

The purpose of this sample project is to showcase that it is achievable to inject *Spring* beans into
objects that are not created in the Java language.

Using *Spring* and *AspectJ* it is possible to add transformation endpoints to the classloader that allows
Spring to inject beans into objects instantiated outside of the application context.
That is, objects made with the **new** keyword.

It also shows doing the same to *Groovy* and *Scala* objects. This project does not focus on the dynamic
capabilities of Groovy, nor functional programming techniques available in Scala.

Bean injection in Groovy was supposed to be easy because of its similarity with Java, and that it is backed by SpringSource/VMWare.
I wanted to figure out if the same could be said about Scala. Luckily Scala is a good citizen regarding classloading compatibility.

All rich objects are instantiated with the *new* keyword, so they are marked as @Configurable
so that their Spring dependencies can be injected. Read about [Load Time Weaving](http://static.springsource.org/spring/docs/2.5.5/reference/aop.html) for more details.

This project requires Java 6 and it is built using Maven 3. In POM.XML you can find:

- Spring framework libraries including logging and AOP support
- AspectJ libraries
- Groovy libraries (version 2.0)
- Scala libraries (version 2.8)

It should work ok with newer versions of Groovy and Scala.

The Java and Groovy classes are built together using the [Groovy Eclipse Compiler Plugin](http://groovy.codehaus.org/Groovy-Eclipse+compiler+plugin+for+Maven).
The Scala classes are interwoven using the [Scala Maven Plugin](https://github.com/davidB/scala-maven-plugin).

You can execute the program with Maven as well, using the [Exec Maven Plugin](http://mojo.codehaus.org/exec-maven-plugin/) with the command:

*mvn exec:exec*

This plugin adds the Spring agent to the jvm running the program. This agent is needed for the class transformations.

If you are building the classic WebApp project that uses Spring and builds with Maven,
rest sure that you can mix Groovy and Scala with your Java objects and access the features of these powerful languages.
Of course you do not need classloading modifications and Load Time Weaving if your objects live inside Spring's context.
I cannot wait to see those stateless services written in Scala and those domain and DTO objects written in Groovy.

