package com.pace.elanpractice;

public class Square extends Rectangle
{
	private double l;
	private String n;
	
	public Square(String inN, int inL)
	{
		super(inN,inL,inL);
		l = inL;
	}
}
