
public class Warrior 
{
	private String name;
	private int strength;
	private int healthLevel;
	
	public Warrior(String inName, int inStrength, int inHealth)
	{
		name = inName;
		strength = inStrength;
		healthLevel = inHealth;
	}
	
	public Warrior(String inName)
	{
		name = inName;
		strength = 10;
		healthLevel = 200;
	}
	
	Warrior(Warrior inWarrior)
	{
		name = inWarrior.name;
		strength = inWarrior.strength;
		healthLevel = inWarrior.healthLevel;
	}
	
	public boolean isAlive()
	{
		if(this.healthLevel > 0)
		{
			return true;
		}
		return false;
	}
	
	public void smite(Warrior inW)
	{
		/*
		 * 	An instance method called smite that takes one parameter of type Warrior. 
		 * The current [warrior] object will “smite” the [inWarrior] parameter, which means the [in warrior] parameter’s healthLevel will be decreased by the strength of
			the current object.
			 Print something to the console like:
			Conan the Barbarian has smitten Galdolf, doing 12 points of damage!
		 */
		
		//our strength - thier health		
		this.healthLevel -= inW.strength;
		System.out.println(inW.name+" has smitten "+this.name+", doing "+inW.strength+" points of damage!");
	}
	
	
	public boolean equals(Warrior inW)
	{
		if(this.name.equals(inW.name) && this.strength == inW.strength)
		{
			return true;
		}
		return false;
	}
	
	
	public String toString()
	{
		return this.name+" - Strength: "+this.strength+", Health: "+this.healthLevel;
	}
	
	public static Warrior fight(Warrior w1, Warrior w2)
	{
		/*A static method called fight. 
		 * This method takes two parameters of type Warrior, 
		 * and returns a Warrior. 
		 * 
		 * 
		 */
		int count = 0;
		while(w1.isAlive() && w2.isAlive())//(Note: You should never allow a Warrior who has died to still “smite” the other one!)
		{
			//The two Warriors will take turns smiting one another until one of them is dead. 
			//(The first parameter gets to strike first!)
			if(count % 2 == 0)
			{
				w1.smite(w2);
				count++;
			}
			else
			{
				w2.smite(w1);
				count = 0;
			}
		}
		
		// Be sure to do some kind of output that indicates what is going on and who wins at the end.
		// The method will return a reference to the winner.
		if(w1.isAlive())
		{
			System.out.println(w1+" won the fight.");
			return w1;
		}
		
		System.out.println(w2+" won the fight.");
		return w2;
		
	}
	
	public static Warrior tournament(Warrior w1, Warrior w2, Warrior w3, Warrior w4)
	{
		/*10. A static method called tournament. This method takes four parameters of type Warrior, and returns
		a Warrior. */
		
		Warrior win1 = fight(w1,w2); //The first and second parameters will fight. 
		
		Warrior win2 = fight(w3,w4); //Then the third and fourth parameters will fight.
				
		return fight(win1,win2); //The method returns a reference to the winner of this last fight.
	}
	
	public static void main(String[] args) 
	{
		Warrior elan = new Warrior("Elan");
		Warrior kaylee = new Warrior("Kaylee",60,300);
		
		Warrior hekla = new Warrior("Hekla",20,200);
		Warrior hanna = new Warrior("Hanna",30,150);
		
		System.out.println(tournament(elan,kaylee,hekla,hanna)+" IS THE WINNER!");
	}
}
