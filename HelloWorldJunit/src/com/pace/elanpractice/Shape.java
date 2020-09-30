package com.pace.elanpractice;

public abstract class Shape implements Comparable<Shape>
{
	/*
	 * Shape
	 * -triangle
	 * -rectangle
	 * --square
	 * -Circle
	 * 
	 * interface impliments Comparable<shape>
	 * +getArea()
	 * +compareTo()
	 * 
	 * 
	 * shapesort<comparable>
	 * selectionSort(comparable<shape> shape)
	 * 
	 * ShapeDriver
	 * -list of shapes
	 * -sort them ascending using selection sort
	 
	 */
	String name;
	
	public Shape(String inName)
	{
		name = inName;
	}
	
	public int compareTo(Shape other)
	{
		double result;
		
		if(name.equals(other.name))
		{
			if(this.calculateArea() > other.calculateArea())
			{
				result = 1;
			}
			else
			{
				result = -1;
			}
		}
		else
		{
			if(this.calculateArea() > other.calculateArea())
			{
				result = 1;
			}
			else
			{
				result = -1;
			}
			
		}
		return (int) result;
	}
	
	public abstract double calculateArea();
}
