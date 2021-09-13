package Labwork1;
public class Tribe 
{
	 private String name;
	 private int population;
	 private int fire_xp;

	 //!     Getters
	 public String getName()             //? Gets tribe name
	 { 
	     return name;
	 }
     public int getPopulation()          //? Gets tribe population 
     {
     	return population;
     }

	 public int getFire_xp()             //? Gets tribe experience 
	 {
	     return fire_xp;
	 }

	 //!       Setters

	 public void setName(String new_name)        //?  Sets tribe name
	 {
	     name = new_name;
	 }
	 public void setPopulation(int new_population) //?  Gets tribe population
	 {
	     population = new_population;
	 }

	 public void setFire_xp(int new_fire_xp)         //? Gets tribe experience
	 {
	     fire_xp = new_fire_xp;
	 }

	 //!       Console Print
	 public void toConsole()
	 {
	     System.out.println("Название племени: " + name);
	     System.out.println("Население племени: " + population);
	     System.out.println("Знакомство с огнем: " + fire_xp +"%");
     }

}
