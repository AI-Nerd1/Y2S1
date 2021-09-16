package Labwork2;
public class Tribe2
{
	String name;
	int population;
	int fire_xp;

	Tribe2()
	{
		name = "Aboriginals";
		population =100;
		fire_xp = 15;
	}
	
	Tribe2(String n)
	{
		name = n;
		population =75;
		fire_xp = 20;
	}
	
	Tribe2(String n, int p, int f)
	{
		name = n;
		population = p;
		fire_xp = f;
	}
	
	Tribe2(Tribe2 tb1)
	{
		name = tb1.name;
		population = tb1.population;
		fire_xp = tb1.fire_xp;
	}
}
