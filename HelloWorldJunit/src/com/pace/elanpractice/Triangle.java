package com.pace.elanpractice;

public class Triangle extends Shape
{
	private double base, height;
	public Triangle(String inName, double inBase, double inHeight)
	{
		super(inName);
		base = inBase;
		height = inHeight;
	}
	
	public double calculateArea() 
	{
		return 0.5*(base*height);
	}
}
