package edu.hfcc.b;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.hfcc.Business;
import edu.hfcc.Family;
import edu.hfcc.Friend;

public class ContactFrame extends JFrame {
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 300;

	private List<JCheckBox> familyCheckBox = new ArrayList();
	private List<JCheckBox> friendCheckBox = new ArrayList();
	private List<JCheckBox> businessCheckBox = new ArrayList();
	
	public ContactFrame(String title, List<Family> familyList , List<Friend> friendList,
			List<Business> businessList) {
		super(title);
		initializeFrame();
		
		JPanel panel1 = new JPanel();
		
		
		//JLabel heading = new JLabel("Contact Manager");
		//heading.setFont(new Font("", Font.BOLD, 25));
		//add(heading);
		panel1.add(new JLabel("Contact Manager                               "));
		
		add(panel1);
		
		add(new JLabel("Family    "));
		
		for (Family f : familyList ) {
			JCheckBox familyNameCheckBox = new JCheckBox(f.getName(), false);
			this.familyCheckBox.add(familyNameCheckBox);
			add(familyNameCheckBox);
		}
		
		add(new JLabel("Friend  "));
		
		for (Friend fr : friendList ) {
			JCheckBox friendNameCheckBox = new JCheckBox(fr.getName(), false);
			this.friendCheckBox.add(friendNameCheckBox);
			add(friendNameCheckBox);
		}
		
		add(new JLabel("Business  "));
		
		for (Business b : businessList ) {
			JCheckBox businessNameCheckBox = new JCheckBox(b.getName(), false);
			this.friendCheckBox.add(businessNameCheckBox);
			add(businessNameCheckBox);
		}
		
		
	
		
		
	}
	
	private void initializeFrame() {
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
