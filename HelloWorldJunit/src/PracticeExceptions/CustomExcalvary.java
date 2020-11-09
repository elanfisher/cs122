package PracticeExceptions;

import java.util.Scanner;

class CustomExcalvary 
{
	static void validateInput(int number) throws InvalidInputException{
		if(number > 100){
			throw new InvalidInputException("Exception");
		}
		System.out.println("Valid Input");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Num < 100: ");
		int num = sc.nextInt();
		try {
			validateInput(num);
		}
		catch(InvalidInputException e) {
			System.out.println("Caught it - > 100 :(");
		}
	}

}

class InvalidInputException extends Exception{
	InvalidInputException(String exceptionTextt){
		super(exceptionTextt);
	}
}