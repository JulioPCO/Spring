package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;


public class Car implements Vehicle{  
    @Autowired 
    private Motor motor;
    
    
    public void drive(){
        System.out.println("Car driving");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void printMotor(){
        System.out.println(motor);
    }

  
    
}
