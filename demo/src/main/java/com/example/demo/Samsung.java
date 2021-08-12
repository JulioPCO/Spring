package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("snapdragon") //specify the class for the interface, use the id here (the lowercasename) not the class name
    MobileProcessor cpu;

    public void info(){
        System.out.println("Samsung last gen");
        cpu.processor();
    }
}
