package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle{
    public void drive(){
        System.out.println("Moto driving");
    }
}
