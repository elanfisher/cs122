package com.cs122.classlabs;

public class CarHelper {

	public static void main(String[] args) 
	{
		//init car object
		//print information
		Car c1 = new Car(4);
		c1.getDetails();
		
		c1.setWheels(12);
		System.out.println("Wheels: "+c1.getWheels());
	}

}
