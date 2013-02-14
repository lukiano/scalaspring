package com.lucho.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public void greet() {
        System.out.println(this.getGreetSentence());
    }

    @Override
    public String getGreetSentence() {
        return "Hello there!";
    }

}
