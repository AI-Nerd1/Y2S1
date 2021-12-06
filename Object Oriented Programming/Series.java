package Labwork10;

import java.util.Scanner;

public class Series 
{
	public static final int NUM = 4;
	public static final int NUMM = 2;
	public static Scanner sc = new Scanner(System.in);
	public static int[][] array = new int[NUM][NUMM];
	
	static void Array() {
		array[0][0] = Money.first_rub;
		array[0][1] = Money.first_kop;
		array[1][0] = Money.second_rub;
		array[1][1] = Money.second_kop;
		array[2][0] = Labwork10.rub_sum;
		array[2][1] = Labwork10.kop_sum;
		array[3][0] = Labwork10.rub_sub;
		array[3][1] = Labwork10.kop_sub;
		System.out.println("     Array");
		System.out.print("================");
		for (int i = 0; i < NUM; i++)
		{
			for (int j = 0; j < NUMM; j++)
			{
				if(j % 2 == 0)
				{
					System.out.println(" ");
				}
				System.out.print(array[i][j]+ ",");
			
			}
		 
		}

	}
	
}
