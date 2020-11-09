package PracticeExceptions;

import java.util.Scanner;

public class P_11_2 {

	/*
	 * PP 11.2 Modify the solution to PP 11.1 such that it catches and 
	 * handles the exception if it is thrown. Handle the exception by 
	 * printing an appropriate message, 
	 * and then continue processing more strings.
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = 1;
		
		do {
			try {
				System.out.println("Str < 6: ");
				String input = in.nextLine();
				
				if(input.length() > 5) {
					throw new StringTooLongException(input.length());
				}
				else if(input.equals("DONE")) {
					a = 2;
				}
			}
			catch(Exception e) {
				System.out.println("Hmm dog were in it: "+e);
			}
		}while(a==1);
	}
	
}

class StringTooLongException extends Exception {
	int a;
	StringTooLongException(int num) {
		a = num;
		System.err.println("That str is too large: "+num);
	}
}