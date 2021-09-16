package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Demo d=context.getBean("demo",Demo.class);
		System.out.println(d);
		
	//	another way to solve this is with the use of spring expression language API in which there is a class name SpelExpressionParser
		SpelExpressionParser exp = new SpelExpressionParser();
		Expression expression =exp.parseExpression("24+56");
		System.out.println(expression.getValue());
	}

}
