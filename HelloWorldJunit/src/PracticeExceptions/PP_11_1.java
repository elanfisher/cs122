package PracticeExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PP_11_1 {

	/*
	 * PP 11.1 Write a program that creates an exception class called
	 * StringTooLongException, designed to be thrown when a string is discovered
	 * that has too many characters in it. In the main driver of the program, read
	 * strings from the user until the user enters "DONE". If a string is entered
	 * that has too many characters (say 20), throw the exception. Allow the thrown
	 * exception to terminate the program.
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = 1;
		do {
			//try {
			try {
				FileReader file = new FileReader("file.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println("Str < 20: ");
			String input = in.nextLine();
			
			if(input.length() > 5) {
				a = 2;
				//throw new StringTooLongException(input.length());
			}
			else if(input.equals("DONE")) {
				a = 2;
			}
			//}
			//catch(Exception e) {
			//	System.out.println();
			//}
		}while(a==1);
	}

}

class StringTooLongException extends Exception {
	int a;

	StringTooLongException(int num) {
		a = num;
		System.err.println("Yo that str too big dog: " + num);
	}
}