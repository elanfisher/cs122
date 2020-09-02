package com.cs122.classlabs;

public class Car extends Vehicle
{
	//gears = 5 in constructor
	//getDetails = prints wheels, and gears
	
	private int gears;
	
	public Car(int inWheels)
	{
		super(inWheels);
		gears = 5;
	}
	
	public void getDetails()
	{
		System.out.println("Wheels: "+wheels+". gears: "+gears+".");
	}
}
