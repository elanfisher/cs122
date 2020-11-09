package PracticeExceptions;

import java.util.ArrayList;

public class PP_11_3 {
	/*
	 * PP 11.3 Suppose in a particular business all documents are given a two-character designation starting with either U, C, or P,
	 *  standing for unclassified, confidential, or proprietary. 
	 
	 *  Create an exception class called InvalidDocumentCodeException, 
	 *  designed to be 
	 *  ----thrown when an improper designation 
	 *  ---------for a document is encountered during processing. 
	 *  If a document designation is encountered that doesn’t fit that description,the exception is thrown. 
	 *  Create a driver program to test the exception, allowing it to terminate the program.
	 */
	public static void main(String[] args)
	{
		ArrayList<Doc> docList = new ArrayList<Doc>();
		Doc d1 = new Doc("R&D","C");
		Doc d2 = new Doc("basket","U");
		Doc d3 = new Doc("brainchild","P");
		Doc d4 = new Doc("treehands","Q");
		Doc d5 = new Doc("wovenFab","X");
		Doc d6 = new Doc("yesterdaytea","P");
		
		docList.add(d1);
		docList.add(d2);
		docList.add(d3);
		docList.add(d4);
		docList.add(d5);
		docList.add(d6);
		
		for(Doc i: docList) {
			try {
				if(!(i.getType().equals("U") || i.getType().equals("C") || i.getType().equals("P"))) {
					throw new InvalidDocumentCodeException(i);
				}
				else {
					System.out.println(i.getName()+" has the proper type: "+i.getType());
				}
			}
			catch(Exception e){
				System.err.println("ex: "+e);
			}
		}
	}	
}

class Doc {
	private String type,name;
	Doc(String inName, String inType){
		type = inType;
		name = inName;
	}
	public String getName()
	{
		return this.name;
	}
	public String getType()
	{
		return this.type;
	}
}

class InvalidDocumentCodeException extends Exception{
	InvalidDocumentCodeException(Doc d){
		System.out.println();
		System.err.println("Doc: "+d.getName()+" has invalid type: "+d.getType());
	}
}