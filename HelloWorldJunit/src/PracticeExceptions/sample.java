package PracticeExceptions;

import java.util.Scanner;

public class sample {

	public static void main(String[] args)
	{
		//Errors = unchecked (Can't be recovered from-runtime) 
		//-----(divide by zero)
		//Exceptions = Checked (Possible to recover from-compile and runtime) 
		// ----(IO exception) - you gotta handle them yourslef
		
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do {
			try {
				System.out.println("Enter first num: ");
				int n1 = input.nextInt();
				
				System.out.println("Enter seccond num: ");
				int n2 = input.nextInt();
				
				int sum = n1/n2;
				
				System.out.println(sum);
				x=2;
			}
			catch(Exception e){
				System.out.println("You cant do that");
			}
		}while(x==1);
	}

}
