package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//this will give each time a new object reference(hashcode) whereas singleton will give same reference type for each object call.
public class Student {
	@Value("Bihar")
	private String State;
	@Value("Patna")
	private String City;
	@Value("#{list}")
	private List<String> Address;

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}
	

	public List<String> getAddress() {
		return Address;
	}

	public void setAddress(List<String> address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [State=" + State + ", city=" + City + "]";
	}

}
