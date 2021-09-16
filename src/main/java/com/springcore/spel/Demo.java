package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Demo {
	
	@Value("#{20+30}")
	private int x;
	
	@Value("#{45-30}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")// this expression is used to call static method 
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")//this expression is used to call static variable
	private double e;
	
	@Value("#{new java.lang.String('sagar prince')}")// this expression is used to call object of a class.
	private String name;
	
	@Value("#{8>5}")//this expression is is used to check for the boolean value true or false
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	

	
}
