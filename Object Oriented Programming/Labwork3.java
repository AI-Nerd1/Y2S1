package Labwork3;
import java.util.Scanner;  
public class Labwork3 
{
	public static final int NUM = 20;
	public static void main(String[] args) 
	{
		int[] array = new int[NUM];
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Введите элементы массива: "); 
			for (int i = 0; i < NUM; i++)
			{
				array[i] = sc.nextInt();
			}
		} 
		System.out.print("Начальный массив: ["); 
		for (int i = 0; i < NUM; i++)
		{
			System.out.print(array[i]+ ", ");
		}
		System.out.print("]"); 
		for (int i = 0; i < NUM; i++)
		{
			if (array[i] < 2)
			{
				array[i] = -1;
			}
			if (array[i] > 10)
			{
				array[i] = 1;
			}
		}
		System.out.println(""); 
		System.out.print("Модифицированный массив: "); 
		for (int i = 0; i < NUM; i++)
		{
			if(i % 5 == 0)
				  System.out.println(" ");
			System.out.print(array[i]+ ", ");
			
		}
		 
	}

}


