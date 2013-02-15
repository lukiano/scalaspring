package com.lucho;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@EnableLoadTimeWeaving
@EnableSpringConfigured
@ComponentScan("com.lucho.service")
public class SpringConfiguration {

}
