package com.pace.elanpractice;

import java.util.Random;

public class ShapeDriver {

	public static void main(String[] args) 
	{
		Random ran = new Random();
		System.out.println(ran.nextInt(100));
		
		Shape[] shapeList = new Shape[6];
		
		shapeList[0] = new Triangle("t1"+ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
		shapeList[1] = new Triangle("t2"+ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
		shapeList[2] = new Rectangle("r1"+ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
		shapeList[3] = new Rectangle("r2"+ran.nextInt(100), ran.nextInt(100), ran.nextInt(100));
		shapeList[4] = new Circle("c1"+ran.nextInt(100), ran.nextInt(50));
		shapeList[5] = new Circle("c2"+ran.nextInt(100), ran.nextInt(50));
		
		
		printShapes(shapeList);
		printSorted(shapeList);
	}
	
	public static void printShapes(Shape[] sList)
	{
		System.out.println("Shape-un--Area---------");
		for(Shape s : sList)
		{
			System.out.println(s.name + ":\t"+s.calculateArea());
		}
	}
	public static void printSorted(Shape[] sList)
	{
		System.out.println("Shape-S--Area---------");
		
		sList = selectionSort(sList);
		
		for(Shape s : sList)
		{
			System.out.println(s.name + ":\t"+s.calculateArea());
		}
	}
	
	public static Shape[] selectionSort(Shape[] shape)
	{
		Shape[] sortedShape = shape;
		
		//i = 0, go through and compare setting min. swap min with element.
		int min; //= shape[0].compareTo(shape[1]);
		
		for(int i = 0; i < shape.length; i++)
		{
			min = i;
			for(int j = i+1; j < shape.length; j++)
			{
				//System.out.println(shape[i].compareTo(shape[j]));
				if(shape[j].compareTo(shape[min]) < 0)//if its smaller
				{
					min = j;
				}
			}
			Shape temp = shape[i];
			shape[i] = shape[min];
			shape[min] = temp;
		}
		
		return sortedShape;
	}

}
