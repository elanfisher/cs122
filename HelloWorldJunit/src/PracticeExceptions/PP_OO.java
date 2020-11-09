package PracticeExceptions;

import java.util.Scanner;

public class PP_OO {

	public static void main(String[] args) 
	{
		//string || int -> else throw new Exception		
		Scanner sc = new Scanner(System.in);		
		
		int end = 1;
		do {
			System.out.println("Int/Str: ");
			String iStr = sc.nextLine();
			try {
				int testString = Integer.parseInt(iStr);
				System.out.println("This is an Int");
			}catch(Exception e) {
				System.out.println("This is not an int");
			}
			
		}while(end == 1);
	}
}

