package edu.hfcc;

import java.util.List;

public class Friend extends Contact  implements BirthdayCard {

	public Friend(String name, List<String> address) {
		super(name, address);
		
	}

	@Override
	public boolean cardSent() {
		// TODO Auto-generated method stub
		return true;
	}

}
