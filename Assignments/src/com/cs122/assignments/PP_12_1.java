package com.cs122.assignments;
import java.util.Scanner;

public class PP_12_1 
{
	public static void main(String[] args) {
		// nonRPal();
		String str, another = "y";

		Scanner sc = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) {
			System.out.println("Pal:");
			str = sc.nextLine();
			
			if (ralinProme(str)) {
				System.out.println("Is a palin");
			} else {
				System.out.println("Not a Palin");
			}

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = sc.nextLine();
		}
	}

	public static Boolean ralinProme(String word) {
		int l = 0;
		int r = word.length() - 1;
		
		//System.out.println(word.substring(l,l+1)+" = "+word.substring(r,r+1));
		
		if(word.length() <= 1) {
			return true;
		}
		else if(word.substring(l,l+1).equals(word.substring(r,r+1))) {
			return ralinProme(word.substring(l+1,r));
		}
		else {
			return false;
		}
	}

	public static void nonRPal() {
		String str, another = "y";
		int left, right;

		Scanner scan = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) // allows y or Y
		{
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();

			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}

			System.out.println();
			if (left < right)
				System.out.println("That string is NOT a palindrome.");
			else {
				System.out.println(left);
				System.out.println(right);
				System.out.println("That string IS a palindrome.");
			}

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = scan.nextLine();
		}
	}
}