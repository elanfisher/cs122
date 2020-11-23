package com.pace.elanpractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
      Scanner scan = new Scanner(System.in);
      String nameDog = "";
      String nameCat = "";
      
      System.out.println("how many dogs? ");
      int dogNum = scan.nextInt();
      
      scan.nextLine();
      
      Dog doglist[] = new Dog[dogNum];

      for (int i = 0; i < dogNum; i++) 
      {
         System.out.println("Name: ");
         nameDog = scan.nextLine();
         
         doglist[i] = new Dog();         
         doglist[i].setName(nameDog);
      }

      System.out.println("how many cats? ");
      int catNum = scan.nextInt();
      scan.nextLine();
      
      Cat catlist[] = new Cat[catNum];

      for (int i = 0; i < catNum; i++) 
      {
         System.out.println("Name: ");
         nameCat = scan.nextLine();
         
         catlist[i] = new Cat();         
         catlist[i].setName(nameCat);
      }

      for (int i = 0; i < dogNum; i++) 
      {
         System.out.println(doglist[i].speak());
      }

      for (int i = 0; i < catNum; i++) 
      {
         System.out.println(catlist[i].speak());
      }
   }
}
