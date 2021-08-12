package com.example.demo;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig { //The beans are not necessary if you add the @Component to this classes(including Snapdragon) and add componentScant
                        //By default the component name is the lowercase verison of the class name -> Samsung id=samsung which is non qualified and decapitalized

    // @Bean
    // public Samsung getPhone(){
    //     return new Samsung();
    // }

    // @Bean
    // public MobileProcessor getProcessor(){
    //     return new Snapdragon();
    // }
}
