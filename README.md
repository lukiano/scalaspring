Injecting Spring beans into POSOs and POGOs
=========================

The purpose of this sample project is to showcase that it is achievable to inject *Spring* beans into objects that are not created in the Java language.

Using *Spring* and *AspectJ* it is possible to add transformation endpoints to the classloader that allow Spring to inject beans into objects instantiated outside of the application context. That is, objects made with the **new** keyword.

It also shows doing the same to *Groovy* and *Scala* objects.

Groovy was supposed to be easy because of its similarity with Java, and that is backed by SpringSource.
Scala was the real challenge.

Talk about using @Inject instead of @Autowired.

Talk about using @Configurable and Load Time Weaving

Talk about compiling and executing with Maven

