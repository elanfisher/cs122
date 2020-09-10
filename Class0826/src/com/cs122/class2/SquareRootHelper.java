package com.cs122.class2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRootHelper 
{

		public static double squareRoot2(int number) 
		{
			double temp;

			double sr = number / 2;

			do 
			{
				
				temp = sr;
				sr = (temp + (number / temp)) / 2;
				
			} while ((temp - sr) != 0);

			return sr;
	    }
		public static double squareRoot(int n) 
		{
			double x = n/2;
			for(int i = 0; i < 10; i++)
			{
				double m = 2*(x);
				double q = (x*x) - n;
				double b = q - (m * x);
				x = (-b/m);
			}
			
			return x;
		}
	
	    public static void main(String[] args)  
	    {
			System.out.print("Enter any number:");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt(); 
			scanner.close();
	
			System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
			System.out.println("Real square root of "+ num+ " is: "+squareRoot2(num));
			System.out.println("Java square root of "+ num+ " is: "+Math.sqrt(num));
			System.out.println("% square root of "+ num+ " is: "+(squareRoot(num)/Math.sqrt(num)*100));
	    }
}
