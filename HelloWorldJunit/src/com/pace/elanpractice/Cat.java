package com.pace.elanpractice;

public class Cat 
{
	private String name;
   public Cat() {
      name = null;
   }
   public void setName(String inName) 
   {
      name = inName;
   }
   public String getName() 
   {
      return name;
   }

   public String speak() 
   {
      return (name + " says meow!");
   }
}
