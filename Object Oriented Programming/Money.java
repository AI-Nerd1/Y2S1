package Labwork10;

import java.util.Scanner;

public class Money {
	
	public static int first_rub = 0;
	public static int second_rub = 0;
	public static int first_kop = 0;
	public static int second_kop = 0;
	static Scanner sc = new Scanner(System.in);
	
	static void money(){
		System.out.print("First Amount ");
		System.out.println("Rubles: ");
		first_rub = sc.nextInt();
		System.out.println("Kopek: ");
		first_kop = sc.nextInt();
		if (first_kop > 99){
			 throw new IllegalArgumentException("value too large");
		}
		System.out.println("First amount = " + first_rub + " руб " + first_kop + " коп ");
		System.out.println("==================================\n ");
		
		System.out.println("Second Amount ");
		System.out.println("Rubles: ");
		second_rub = sc.nextInt();
		System.out.println("Kopek:");
		second_kop = sc.nextInt();
		if (second_kop > 99){
			throw new IllegalArgumentException("value too large");
			 }
		System.out.println("Second amount = " + second_rub + " руб " + second_kop + " коп ");
		System.out.println("==================================\n ");
	}

}
