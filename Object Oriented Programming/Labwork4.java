package Labwork4;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//package Labwork4;
import java.io.*;
public class Labwork4 
{
	static void matrixKeyboard() 
	{
		int n = 5;
		int m = 5;
		int[][] arr = new int[n][m];
		try (Scanner in = new Scanner(System.in))
		{
			arr = new int[n][m];
			System.out.println("Enter the elements of the matrix: "); 
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) 
				{
					arr[i][j] = in.nextInt();
				}
			}
		}
		System.out.print("Модифицированный массив: "); 
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++) 
			{
				if(i % 5 == 0)
					System.out.println(" ");
				System.out.print(arr[i]+ ", ");
			}
			
		}
		
	}
//	static void matrixFile()
//	{
//		String path = "test.txt";
//		int[][] arr = null;
//		try 
//		{
//			try (Scanner in = new Scanner(new File(path)))
//			{
//				n = in.nextInt();
//				m = in.nextInt();
//				arr = new int[n][m];
//				for (int i = 0; i < n; i++) {
//					for (int j = 0; j < m; j++) {
//						arr[i][j] = in.nextInt();
//					}
//				}
//			}
//		} catch (FileNotFoundException e) {
//		System.out.println("Ошибка " + e + "! файл " +
//		path + " не найден!");
//		} catch (InputMismatchException e) {
//		System.out.println("Ошибка " + e + "! Не
//		соответствие типов данных!");
//		}
//	}
public static void main (String args[]) 
	{
		int fromFile = 1;
		int fromKeyboard = 2;
		int choice;
		try(Scanner in = new Scanner(System.in))
		{
			System.out.println("Press 1 to enter matrix from file; "
					+ "Press 2 to enter matrix from keyboard: ");
			choice = in.nextInt();
		}
		  
        if (choice == fromFile)
        	System.out.println("File input");
        if (choice == fromKeyboard)
        	matrixKeyboard();
        if (choice != fromFile && choice != fromKeyboard)
            System.out.println("wrong input");
	}
}
	
	
	
	