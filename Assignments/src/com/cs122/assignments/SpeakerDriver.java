package com.cs122.assignments;

public class SpeakerDriver {

	public static void main(String[] args) 
	{
		Speaker current;
		current = new Philosopher();
		current.announce("exist");
		current.speak();	
		
		Speaker a1 = new Activitst();
		a1.announce("environmental activism");
		a1.speak();	
		
		Speaker w1 = new Wireless();
		w1.announce("LANDO");
		w1.speak();	
		
		Speaker p1 = new Linguist();
		p1.announce("Farsi");
		p1.speak();	
		
	}
}
