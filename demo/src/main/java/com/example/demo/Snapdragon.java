package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

    @Override
    public void processor() {
        System.out.println("cpu octacore");
        
    }
    
}
