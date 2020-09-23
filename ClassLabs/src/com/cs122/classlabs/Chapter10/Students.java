package com.cs122.classlabs.Chapter10;

public class Students implements Comparable<Students>
{
	/*
	 * create a class called Students with properties `uid(integer) and name(String)
	create a class called Programming - have 6 students assigned id and name -- sort them and find a student with an id that is present and not present
	 */
	
	private int uid;
	private String name;
	
	public Students(int inUid, String inName)
	{
		uid = inUid;
		name = inName;
	}

	public int compareTo(Students o) 
	{
		int result; 
		
		if (uid == o.getUid()) {
		   result = name.compareTo(o.getName());
		}
		else 
		{
		   if(uid > o.getUid())
		   {
			   return 1;
		   }
		   else
		   {
			   return -1;
		   }
		}
		
		return result;
	}

	private String getName() 
	{
		return name;
	}

	private int getUid() {
		return uid;
	}
	
	public String toString()
	{
		return uid + "\t" + name;
	}
}
