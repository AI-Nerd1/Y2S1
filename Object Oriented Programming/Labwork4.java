package Labwork4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Labwork4 
{
	public static final int NUM = 5;
	public static final int NUMM = 5;
	public static Scanner sc = new Scanner(System.in);
	public static int[][] arr = new int[NUM][NUMM];
	public static int [] X = {-1, -1, -1, -1, -1};
	
	//Method for asking user
	static void query()
	{
		int fromFile = 1;
		int fromKeyboard = 2;
		int choice;
		System.out.println("Нажмите 1, чтобы ввести матрицу из файла;\n" + 
				"Нажмите 2, чтобы ввести матрицу с клавиатуры:");
			choice = sc.nextInt();
					  
        if (choice == fromFile)
        {
        	System.out.println("Матрица из файла");
        	read_from_file();
        }
        if (choice == fromKeyboard)
        	{
        	System.out.println("Матрица с клавиатуры");
        	read_from_keyboard();
        	}
        if (choice != fromFile && choice != fromKeyboard)
            System.out.println("неверный ввод!!");
	}
	
	// Method for reading from file	
	public static int[][] read_from_file() {
		
		try {
			try (Scanner in = new Scanner(new File("data.txt"))) {

				
				for (int i = 0; i < NUM; i++) {
					for (int j = 0; j < NUMM; j++) {
						arr[i][j] = in.nextInt();
						}
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("Ошибка " + e + "! файл " + "data.txt" + " не найден!");
				} catch (InputMismatchException e) {
					System.out.println("Ошибка " + e + "! Не соответствие типов данных!");
					}

		return arr;
		}

	// Method for reading matrix from keyboard
	static void read_from_keyboard() 
	{
		
			System.out.println("Введите 25 чисел: "); 
			for (int i = 0; i < NUM; i++)
			{
				for (int j = 0; j < NUMM; j++) 
				{
					
						arr[i][j] = sc.nextInt();
					
				}
			}
				
			}
	
	// method for displaying on console
	static void display()
		{
		System.out.print("Начальная матрица"); 
			for (int i = 0; i < NUM; i++)
			{
				for (int j = 0; j < NUMM; j++)
				{
					if(j % 5 == 0)
					{
						System.out.println(" ");
					}
					System.out.print(arr[i][j]+ ", ");
				
				}
			 
			}
		}

	// Method for determining X
	static void calc()
	{
		int min = arr[0][0];  
        for (int i = 0; i < arr.length; i++) 
        {
        	for (int j = 0; j < arr.length; j++) 
             
           if(arr[i][j] < min)  
               min = arr[i][j]; 
        }  
        for (int i = 0; i < arr.length; i++) 
        {
        	for (int j = 0; j < arr.length; j++) 
        	{
        		if(arr[i][j] == min)  
        		{
        			X[i] = 1;
        		}
        	}
        }
        System.out.print("\nМассив X: ");
        for (int i = 0; i < 5; i++)
		{
			System.out.print(X[i]+ ", ");
		
		}
	}
	
	//Method for displaying Array X
	static void calc_display()
	{
		 System.out.print("\nМассив X: ");
	        for (int i = 0; i < 5; i++)
			{
				System.out.print(X[i]+ ", ");
			
			}
	}

	// Method for writing Array X to file
	static void write_to_file()
	{
		
	try {
		PrintStream print = new PrintStream(new FileOutputStream("arrayX.txt"));
		System.setOut(print);
		System.out.print("Массив X: ");
        for (int i = 0; i < 5; i++)
		{
			System.out.print(X[i]+ ", ");
		
		}
		print.close();
		} catch(FileNotFoundException e) 
		{
			e.printStackTrace();		
		}
	}
	
	//Main port
	public static void main (String args[]) 
	{		
        query();
		display();
		calc();
//		calc_display();
		write_to_file();
	}
}
	
	
	
	