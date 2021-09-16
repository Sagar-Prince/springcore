package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	//@PostConstruct and @PreDestroy is applicable upto java 8. But if we want to use @PostConstruct and @PreDestroy then we have to add this dependency in pom.xml.
	
	 /* <dependency> <groupId>javax.annotation</groupId>
	 * <artifactId>javax.annotation-api</artifactId> <version>1.3.2</version>
	 * </dependency>
	 */
	@PostConstruct
	public void start() {
		System.out.println("Starting @PostConstruct (init method)");
	}
	@PreDestroy
	public void end() {
		System.out.println("endind @PreDestroy (destroy method)");
	}

}
