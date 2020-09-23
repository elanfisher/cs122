package com.cs122.assignments;

public class Activitst implements Speaker{

	@Override
	public void speak() {
		System.out.println("IM UPSET! AND IM DOING SOMETHING!");
		
	}

	@Override
	public void announce(String str) {
		// TODO Auto-generated method stub
		System.out.println("I am an activist who cares about: "+str+".");
		
	}

}
