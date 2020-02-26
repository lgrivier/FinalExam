package edu.hfcc;

import java.util.List;

public class Business extends Contact implements BirthdayCard {

	public Business(String name, List<String> address) {
		super(name, address);
		
	}

	@Override
	public boolean cardSent() {
		
		return false;
	}

}
