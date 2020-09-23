package com.cs122.assignments;

import java.util.Random;

public class Wireless implements Speaker {
	
	
	public void speak() {
		Random rand = new Random();
		System.out.println("Broadcast ID: "+ rand.ints(1111, 9999).findFirst().getAsInt());

	}

	public void announce(String str) {
		System.out.println(str+": connection complete.");
	}
}
