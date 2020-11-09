package PracticeExceptions;

public class UserDefined 
{
	public static void main(String args[]) 
	{
		try {
			throw new IJustSaidThat(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

