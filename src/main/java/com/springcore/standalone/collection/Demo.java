package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo {
	private List<String> friend;
	private Map<String, Integer> feestructure;
	private Set<String> college;
	private Properties connection;	

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}
	

	public Set<String> getCollege() {
		return college;
	}

	public void setCollege(Set<String> college) {
		this.college = college;
	}
	

	public Properties getConnection() {
		return connection;
	}

	public void setConnection(Properties connection) {
		this.connection = connection;
	}

	@Override
	public String toString() {
		return "Demo [friend=" + friend + ", feestructure=" + feestructure + ", college=" + college + ", connection="
				+ connection + "]";
	}
	

	
	}
	


	
	
	

