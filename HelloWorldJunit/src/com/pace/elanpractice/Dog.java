package com.pace.elanpractice;

public class Dog 
{
   private String name;
   public Dog() {
      name = null;
   }
   public void setName(String inName) {
      name = inName;
   }
   public String getName() {
      return name;
   }

   public String speak() {
      return (name + " says woof!");
   }
}
