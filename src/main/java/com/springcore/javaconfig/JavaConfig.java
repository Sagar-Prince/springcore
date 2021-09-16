package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Person getPerson() {
		return new Person();
		
	}
	
	@Bean(name= {"tramsfer","sagar"})
	public Student getStudent() {
		//object is created
		Student student= new Student(getPerson());
		return student;
	}

}
