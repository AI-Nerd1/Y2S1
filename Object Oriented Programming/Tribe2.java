package Labwork2;
public class Tribe2
{
	String name;
	int population;
	int fire_xp;

	public Tribe2()
	{
		name = "Тувинский";
		population =100;
		fire_xp = 15;
	}
	
	public Tribe2(String n)
	{
		name = n;
		population =75;
		fire_xp = 20;
	}
	
	public Tribe2(String n, int p, int f)
	{
		name = n;
		population = p;
		fire_xp = f;
	}
	
	public Tribe2(Tribe2 tb1)
	{
		name = tb1.name;
		population = tb1.population;
		fire_xp = tb1.fire_xp;
	}

	public void toConsole() 
	{
		 System.out.println("Название племени: " + name);
	     System.out.println("Население племени: " + population);
	     System.out.println("Знакомство с огнем: " + fire_xp +"%");
		
	}
}
