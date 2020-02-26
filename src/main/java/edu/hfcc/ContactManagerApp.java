package edu.hfcc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import edu.hfcc.a.PathCreator;
import edu.hfcc.b.ContactFrame;

public class ContactManagerApp {

	private static final String DELIMITER = ",";

	static List<String> addressInfo = new  ArrayList();
	static List<Family> familyList = new ArrayList();
	static List<Friend> friendList = new ArrayList();
	static List<Business> businessList = new ArrayList();

	
	public static void main(String[] args) {
		
		
		
		readFileToObjectsList();
		ContactFrame cFrame = new ContactFrame("Contact Manager",familyList, friendList, businessList );
		cFrame.setVisible(true);
		
		
	}


	private static void readFileToObjectsList() {
		Path file = new PathCreator().createPathToFile("contact_input.txt", "input");
		List<String> items = new ArrayList();
		InputStream input = null;
		try {
			input = Files.newInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			try {
				String line = reader.readLine();
				
				
				
				while (line != null){
					String[] contactInformationArray = line.split(DELIMITER);
					
					if(contactInformationArray[0].equals("Friend")) {
						
						for(int x = 2 ; x < contactInformationArray.length ; x++) {
							addressInfo.add((String) contactInformationArray[x]);
						}
						
						Friend friend = new Friend((String)contactInformationArray[1],addressInfo);
						friendList.add(friend); 
						
					}
					if(contactInformationArray[0].equals("Business")) {
						for(int x = 2 ; x < contactInformationArray.length  ; x++) {
							addressInfo.add((String) contactInformationArray[x]);
				
						}
						
						Business business = new Business((String)contactInformationArray[1],addressInfo);
						businessList.add(business);
						
						
					}
					if(contactInformationArray[0].equals("Family")) {
						
						for(int x = 2 ; x < contactInformationArray.length  ; x++) {
							addressInfo.add((String) contactInformationArray[x]);
						}
						
						Family family = new Family((String)contactInformationArray[1],addressInfo);
						familyList.add(family);
					}
					
					line = reader.readLine();
					
				}
			} finally {
				reader.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
