package com.pace.elanpractice;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String email = getValidEmail(scan);

		//System.out.println(email);
	}
	
	public static String getValidEmail(Scanner sc) {
		String userEmail = "";
		boolean isNotEmail = true;
		while(isNotEmail) {
			System.out.println("Email: ");
			userEmail = sc.nextLine();
			
			if(userEmail.contains("@") && userEmail.contains(".")) {
				System.out.println("Valid Email Adress");
				return userEmail;
			}
			else {
				System.out.println("Inalid Email Adress");
			}
		}
		return userEmail;
	}

}
