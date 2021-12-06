package Labwork10;

import java.util.Scanner;

public class Complex {
static Scanner sc = new Scanner(System.in);
	
	static void complex(){
		System.out.println("First Amount ");
		System.out.println("Rubles = ");
		int first_rub = sc.nextInt();
		System.out.println("Kopek = ");
		int first_kop = sc.nextInt();
		if (first_kop > 99){
			 throw new IllegalArgumentException("value too large");
		}
		System.out.println("First amount = " + first_rub + " i " + first_kop + " i ");
		System.out.println("==================================\n ");
		System.out.println("Second Amount ");
		System.out.println("Rubles = ");
		int second_rub = sc.nextInt();
		System.out.println("Kopek = ");
		int second_kop = sc.nextInt();
		if (second_kop > 99){
			 throw new IllegalArgumentException("value too large");
		}
		System.out.println("Second amount = " + second_rub + " i " + second_kop + " i ");
		System.out.println("==================================\n ");
	}

}

