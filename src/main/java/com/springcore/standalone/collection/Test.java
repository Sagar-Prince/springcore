package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalongconfig.xml");
		Demo d=context.getBean("demo",Demo.class);
		Demo e=context.getBean("demo2",Demo.class);
		System.out.println(d); 
		System.out.println("********************************************");
		System.out.println(d.getFeestructure());
		System.out.println("********************************************");
		System.out.println(d.getCollege());
		System.out.println("********************************************");
		System.out.println(d.getFriend().getClass().getName());
		System.out.println("------------------------------");
		System.out.println(d.getConnection());
		System.out.println();
		System.out.println(e.getConnection());
		System.out.println(e);
	}

}
