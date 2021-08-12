package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle obj = (Vehicle) context.getBean("vehicle"); // BeanFactory or ApplicationContext interfaces to set getbean, application context might be better for large projects and web app
		obj.drive();

		Vehicle obj2 = (Vehicle) context.getBean("motorbike"); //Although class name is capitalized, the @component identify as a lowercase string
		obj2.drive();

		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println(tyre);

		
		Car obj3 = (Car) context.getBean("car");
		obj3.printMotor();
		
		Samsung samsung = context2.getBean(Samsung.class);
		samsung.info();
	}

}
