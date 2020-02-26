package edu.hfcc;

import java.util.List;

public class Family extends Contact  implements BirthdayCard {

	public Family(String name, List<String> address) {
		super(name, address);
		
	}

	@Override
	public boolean cardSent() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
