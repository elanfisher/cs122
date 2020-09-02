package com.cs122.classlabs;

public class Vehicle 
{
	//#wheels
	//getter
	//setter wheels
	
	protected int wheels;
	
	public Vehicle(int inWheels) 
	{
		wheels = inWheels;
	}
	
	public int getWheels() 
	{
		return wheels;
	}
	
	public void setWheels(int inWheels)
	{
		wheels = inWheels;
	}
}
