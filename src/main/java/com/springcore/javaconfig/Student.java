package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component("mystudent")
public class Student {
	private Person person;
	
	public Student(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void study() {
		this.person.display();
		System.out.println("student is reading");
		
	}
}
