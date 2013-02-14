package com.lucho;

import com.lucho.domain.MyRichObject;
import com.lucho.groovy.MyGroovyObject;
import com.lucho.scala.MyScalaObject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting...");
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        applicationContext.scan("com.lucho.service");

        MyRichObject myRichObject = new MyRichObject();
        MyGroovyObject myGroovyObject = new MyGroovyObject();
        MyScalaObject myScalaObject = new MyScalaObject();

        myRichObject.greet();
        myGroovyObject.groovyGreet();
        myScalaObject.scalaGreet();
    }

}
