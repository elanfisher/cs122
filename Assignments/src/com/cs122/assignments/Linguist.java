package com.cs122.assignments;

public class Linguist implements Speaker {

	@Override
	public void speak() {
		System.out.println("I speak languages.");

	}

	@Override
	public void announce(String str) {
		System.out.println("I am currently learning: "+str+".");

	}

}
