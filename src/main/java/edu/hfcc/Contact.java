package edu.hfcc;

import java.util.ArrayList;
import java.util.List;

public abstract class Contact {

	private String name;
	private List<String> address = new ArrayList();
	
	
	public Contact(String name, List<String> address) {
		super();
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public List<String> getAddress() {
		return address;
	}
	
	
}
