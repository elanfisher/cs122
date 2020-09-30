package com.pace.elanpractice;

public class Circle extends Shape
{

	private double rad;
	public Circle(String inName, double inR)
	{
		super(inName);
		rad = inR;
	}

	public double calculateArea() 
	{
		return Math.PI*(rad*rad);
	}
	
}
