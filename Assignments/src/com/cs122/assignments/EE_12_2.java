package com.cs122.assignments;

import java.util.Scanner;

public class EE_12_2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int go = 1;
		do
		{
			System.out.println("x: ");
			int x = sc.nextInt();
			
			System.out.println("y: ");
			int y = sc.nextInt();
			
			System.out.println(x+"^"+y+":"+raised(x,y));
			
			System.out.println("Again?[1/2]: ");
			go = sc.nextInt();
			if(!(go == 1)) { go =0;}
			
		}while(go == 1);
	}
	
	public static int raised(int x, int y) {
		if(y == 1) {
			return 1;
		}
		else {
			return x * raised(x,y-1);
		}
	}
}
