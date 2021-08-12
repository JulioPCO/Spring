package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // identifies this as the method to be used in mobile interface, either use this or configure in bean in AppConfig
public class Intel implements MobileProcessor{

    @Override
    public void processor() {
        System.out.println("Cpu 7mm");
        
    }
    
}
