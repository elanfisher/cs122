package com.cs122.assignments;

public class Philosopher implements Speaker
{
	public void speak() 
	{
		System.out.println("Man is mortal, Socrates is man, therefore Socrates is mortal.");
	}

	public void announce(String str) 
	{
		System.out.println("I am a philosopher therefore I "+str+".");
	}
}
