package com.cs122.classlabs.Chapter10;

import java.util.Random;

public class Programming 
{
	public static void main(String[] args) 
	{
		/*
		 * create a class called Programming 
		 * - have 6 students assigned id and name
		 *  -- sort them and find a student with an id that is present and not present
		 */	
		
		//System.out.println(args[0]);
		
		//Students.printMe();
		
		Students[] studentList = new Students[6];
		Random rand = new Random();
		
		studentList[0] = new Students(rand.ints(1111, 9999).findFirst().getAsInt(), "Jack");
		studentList[1] = new Students(rand.ints(1111, 9999).findFirst().getAsInt(), "Sarah");
		studentList[2] = new Students(rand.ints(1111, 9999).findFirst().getAsInt(), "Riley");
		studentList[3] = new Students(rand.ints(1111, 9999).findFirst().getAsInt(), "Sydney");
		studentList[4] = new Students(rand.ints(1111, 9999).findFirst().getAsInt(), "Hannah");
		studentList[5] = new Students(rand.ints(1111, 9999).findFirst().getAsInt(), "Ashante");
		
		Sorting<Students> sorts = new Sorting<Students>();
		
		System.out.println("---------not-sorted----------");
		for (Students student : studentList)
		{	
			System.out.println(student); 
		}
		
		sorts.selectionSort(studentList);
		System.out.println("-----------sorted----------");
		for (Students student : studentList)
		{	
			System.out.println(student); 
		}
		
		
	}
}
