package Labwork5;

import java.util.Scanner;
public class Labwork5 
{
	public static void main(String[] args) 
	{
		int cache_volume, RAM_size;
		String brand;
		float clock_frequency, cost;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Brand = ");
		brand = scan.next();
		
		System.out.print("RAM size = ");
		RAM_size = scan.nextInt();
		
		System.out.print("Clock Frequency = ");
		clock_frequency = scan.nextFloat();
		
		System.out.print("Cache Volume = ");
		cache_volume = scan.nextInt();
		
		System.out.print("Cost = ");
		cost = scan.nextFloat();
		
		try 
		{
			Motherboard m1 = new Motherboard();
			System.out.println(m1);
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println(e.getMessage());
		} 
		catch (NullPointerException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
}
