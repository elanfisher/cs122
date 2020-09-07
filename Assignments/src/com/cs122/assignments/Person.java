package com.cs122.assignments;

public class Person 
{
	/*
	Create a Person class
	-, with properties (variables) name,location, savings(optional), checkings(optional), credit(optional)
	-Have method transactSavings(amount)
	-- which calls the method from Savings class.
	*/
	private String name;
	private String location;
	
	private Savings mySavings;
	private Checkings myCheckings;
	private Credit myCredit;
	
	public Person(String inName, String inLocation,Savings inSavings, Checkings inCheckings, Credit inCredit)
	{
		name = inName;
		location = inLocation;
		
		mySavings = inSavings;
		myCheckings = inCheckings;
		myCredit = inCredit;
	}
	
	public void transactSavings(Double inAmount)
	{
		mySavings.withdraw(inAmount);
	}
}
