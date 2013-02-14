package com.lucho.domain;


import com.lucho.service.MyService;
import org.springframework.beans.factory.annotation.Configurable;

import javax.inject.Inject;

@Configurable
public class MyRichObject {

    @Inject
    private MyService myService;

    public void greet() {
        this.myService.greet();
    }

}
