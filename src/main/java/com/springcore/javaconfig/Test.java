package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stu=context.getBean("sagar",Student.class);
		System.out.println(stu);
		stu.study();
	}

}
