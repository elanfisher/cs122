package com.cs122.classlabs.chap11;

public class ExceptionsClass 
{
	public static void main(String[] args)
	{
		try {
			String a = "abcdefgh";
			char c = a.charAt(11);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		try {
			int a = Integer.parseInt("abcdefgh");
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		try {
			String a = null;
			char c = a.charAt(1);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		/*
		int nums[] = new int[6];
		try
        {
			System.out.println("+1 error: " + nums[3]);
        }
		catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("+1 error: " +e);
        }
        catch (StringIndexOutOfBoundsException e1)
        {
            System.out.println("+1 error");
        }
        catch (NumberFormatException e2)
        {
            System.out.println("OH NO NOT THE WRONG NUMBER");
        }
		finally
		{
			System.out.println("Well you finally made it.");
		}
		*/
	}
}
