package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	/*
	 * there are three way of using @Autowired annotation 1) on top of property
	 * Deceleration 2) on setter method 3) on constructor
	 * -@Qulifier("") annotation is basically used with @Autowired annotation to come out of the confusion of multiple Bens present in xml file.
    It has a unique name same as bean name so that it can find the exect bean for the object creation and insilitation 
	 * 
	 */
	@Autowired
	@Qualifier("address1")	
	
	Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setting address value");
		this.address = address;
		
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

		
}
