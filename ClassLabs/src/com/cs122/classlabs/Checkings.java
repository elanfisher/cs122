package com.cs122.classlabs;

public class Checkings extends Account
{
	private double checkings;
	public Checkings(String inName, double inChecking)
	{
		super(inName,inChecking);
		checkings = inChecking;
	}
	
	public void fees()
	{
		System.out.println("IMPLIMENT FEES: 679.01");
	}
		
	public void ballance()
	{
		System.out.println(this.name+"'s checking Ballance: "+super.ballance);
	}
}
