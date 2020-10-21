package com.cs122.classlabs.chap12;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) 
	{
		Scanner sosIn = new Scanner(System.in);
		
		System.out.println("Sum of Squares: "+ sos(sosIn.nextInt()));

	}
	
	public static int sos(int n)
	{
		if(n == 1) {
			return 1;
		}
		else {
			return (n*n) + sos(n-1);
		}
	}
}
