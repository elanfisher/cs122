package PracticeExceptions;

public class SampleException {

	public static void main(String[] args) 
	{
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println("result: "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Cant devide a number by zero");
		}
		try {
			int num = Integer.parseInt("hello");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception");
		}
		try {
			int a[] = new int[5];
			a[7]=9;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds");
		}
		finally {
			System.out.println("Connection Exited");
		}
	}

}
