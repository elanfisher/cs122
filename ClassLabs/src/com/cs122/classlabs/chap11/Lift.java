package com.cs122.classlabs.chap11;

public class Lift 
{
	
	public void floor1()
	{
		System.out.println("First Floor");
		floor2();
	}
	
	public void floor2()
	{
		try {
			System.out.println("Seccond floor");
			System.out.println(0/0);
		}
		catch(Exception e) {
			System.out.println("Cannot devide by zero: "+e.toString());
		}
		
	}
}
