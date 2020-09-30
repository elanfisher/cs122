package com.pace.elanpractice;

public class Rectangle extends Shape
{
	protected double len, hei;
	public Rectangle(String inName, double inLength, double inHeight)
	{
		super(inName);
		len = inLength;
		hei = inHeight;
	}

	public double calculateArea() 
	{
		return len*hei;
	}
}
