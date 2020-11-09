package com.pace.PracticeRecursion;

import java.util.Scanner;

public class PP_12_2 {

	public static void main(String[] args) 
	{
		/*
		 * PP 12.2 Design and implement a program that implements Euclid’s algorithm 
		 * for finding the greatest common divisor of two positive integers. 
		 * The greatest common divisor is the largest integer that divides both values
		 *  without producing a remainder. An iterative version of this method was part 
		 *  of the RationalNumber class presented in Chapter 7. In a class called DivisorCalc,
		 *   define a static method called gcd that accepts two integers, num1 and num2. Create 
		 *   a driver to test your implementation. The recursive algorithm is defined as follows:
		 *   gcd(num1, num2) is num1 if num1 divides into num2 evenly
		 *   gcd(num1, num2) is gcd(num2, num1 % num2) otherwise
		 */
		Scanner sc = new Scanner(System.in);
		int m=0;
		do {
			System.out.println("a: ");
			int a = sc.nextInt();
			
			System.out.println("b: ");
			int b = sc.nextInt();
			
			System.out.println("euclid: "+euclidsGCD(a,b));
			System.out.println("Gcd: "+gcd(a,b));
			
			m = sc.nextInt();
		}while(m==0);
		
	}
	public static int euclidsGCD(int a, int b) { //if(num1 > num2)
		
		/*
		 * 10 5
		 * if(a > b)
		 * a = (10 - 5) = 5
		 * b = 5
		 * 
		 * if(a > b)
		 * 
		 * if (a == b) retun b/a
		 * 
		 */
		if(a==b) {
			return a;
		}
		else if(a > b) {
			return euclidsGCD(a-b,b);
		}
		else {
			return euclidsGCD(b,b-a);
		}
	}
	
	public static int gcd(int num1, int num2)
    {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num1;
    }
}
