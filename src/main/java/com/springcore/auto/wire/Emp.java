package com.springcore.auto.wire;

public class Emp {
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
