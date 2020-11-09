package com.cs122.assignments;
import java.util.Scanner;

public class EE_12_1 
{
	public static void main(String[] args) {
		// nonRPal();
		String letter, another = "y";

		Scanner sc = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) {
			System.out.println("Test Java Identifier:");
			letter = sc.nextLine();
			
			if (isJavaId(letter,0)) {
				System.out.println(letter+" is valid.");
			} else {
				System.out.println(letter+" is invalid.");
			}

			System.out.println();
			System.out.print("Test another letter (y/n)?: ");
			another = sc.nextLine();
		}
	}

	public static Boolean isJavaId(String word, int pos) {
		
		if(word.length() == 1 && validMid(word.charAt(0))) {
			return true;
		}
		else if(validFirst(word.charAt(0)) && pos == 0)
		{
			return isJavaId(word.substring(1,word.length()), pos+1);
		}
		else if(validMid(word.charAt(0)) && pos > 0)
		{
			return isJavaId(word.substring(1,word.length()), pos+1);
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean validFirst(char letter) {
		if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == '_' || letter == '$')) {
			return false; 
		}
		else if(letter == '-' || letter == '+') {
	    	return false;
	    }
		else {
			return true;
		}
		
	 }
	public static boolean validMid(char letter)
	{
	    if (!((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || (letter >= '0' && letter <= '9') || letter == '_' || letter == '$')) {
	    	return false; 
	    }
	    else if(letter == '-' || letter == '+') {
	    	return false;
	    }
	    else {
	    	return true;
	    }
	}
}