package com.lucho.groovy

import com.lucho.service.MyService
import groovyx.transform.Scalify
import org.springframework.beans.factory.annotation.Configurable

import javax.inject.Inject

@Configurable
@Scalify
class MyGroovyObject {

    @Inject
    private MyService myService;

    def groovyGreet() {
        System.out.println myService.greetSentence + " So groovy"
    }

}
