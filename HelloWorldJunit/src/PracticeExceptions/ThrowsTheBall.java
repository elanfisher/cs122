package PracticeExceptions;

public class ThrowsTheBall {

	static void avg() throws ArithmeticException {
		System.out.println("Inside avg method");
		throw new ArithmeticException("Demo");
	}
	public static void main(String[] args) 
	{
		try {
			avg();
		}
		finally
		{
			System.out.println("Cought");
		}
	}
}
