package com.cs122.assignments;

import java.util.Scanner;

public class ExceptionAssignment{

	/*
	 * Write a program that takes an input from user with following conditions
		If the length is greater than 6, throw exception
		if the 6th character is not lowercase letter, it throws an exception.
	 */
	public static void main(String[] args) throws LengthTooLongException
	{
		Scanner in = new Scanner(System.in);
		
		String num = "";//in.next();
		
		while(!num.equals("X"))
		{
			System.out.println("Give me a number <6 chars: ");
			num = in.next();
			
			try {
				if(num.length()>6)
					 throw new LengthTooLongException("Error");
			}
			catch(Exception e)
			{
				System.out.println("Number to large, must be 6 characters.");
			}
			try {
				if(Character.isLowerCase(num.charAt(5)))
					 throw new LengthTooLongException("Wrong Character!");
			}
			catch(Exception j)
			{
				System.out.println("Theres a lowercase in the 6th position.");
			}
			
		}
	}

}
