package Labwork10;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
public abstract class Labwork10 {
	
	public static int rub_sum = 0;
	public static int kop_sum = 0;
	public static int rub_sub = 0;
	public static int kop_sub = 0;
	static void Add()
	{
		rub_sum = Money.first_rub + Money.second_rub;
		kop_sum = Money.first_kop + Money.second_kop;
		if (kop_sum > 99)
		{
			rub_sum = rub_sum + 1;
			kop_sum = kop_sum - 100;
		}System.out.println("Sum: " + rub_sum + " руб. "+ kop_sum + " коп.");
		System.out.print("==================================");
	}
	static void Subtract()
	{
		if (Money.first_rub > Money.second_rub && Money.first_kop > Money.second_kop){
			rub_sub = Money.first_rub - Money.second_rub;
			kop_sub = Money.first_kop - Money.second_kop;
			System.out.println("\nDifference: " + rub_sub + " руб. "+ kop_sub + " коп.");
		}else if(Money.first_rub > Money.second_rub && Money.first_kop < Money.second_kop){
			rub_sub = Money.first_rub - Money.second_rub - 1;
			kop_sub = (100+ Money.first_kop) - Money.second_kop;
			System.out.println("\nDifference: " + rub_sub + " руб. "+ kop_sub + " коп.");
		}else if(Money.first_rub < Money.second_rub && Money.first_kop > Money.second_kop) {
			rub_sub = Money.second_rub - Money.first_rub - 1;
			kop_sub = (100+ Money.second_kop) - Money.first_kop;
			System.out.println("\nDifference: " + rub_sub + " руб. "+ kop_sub + " коп.");
		}else if(Money.first_rub < Money.second_rub && Money.first_kop < Money.second_kop) {
			rub_sub = Money.second_rub - Money.first_rub;
			kop_sub = Money.second_kop - Money.first_kop;
			System.out.println("\nDifference: " + rub_sub + " руб. "+ kop_sub + " коп.");
		}
		System.out.println("================================== ");
		
		
	}
	static void write_to_file()
	{
	try {
		PrintStream print = new PrintStream(new FileOutputStream("file.txt"));
		System.setOut(print);
		System.out.println("First amount = " + Money.first_rub + " руб " + Money.first_kop + " коп ");
		System.out.println("==================================\n ");
		System.out.println("Second amount = " + Money.second_rub + " руб " + Money.second_kop + " коп ");
		System.out.println("==================================\n ");
		System.out.println("Sum: " + rub_sum + " руб. "+ kop_sum + " коп.");
		System.out.println("==================================\n ");
		System.out.println("Difference: " + rub_sub + " руб. "+ kop_sub + " коп.");
		System.out.println("==================================\n ");
		print.close();
		} catch(FileNotFoundException e) 
		{
			e.printStackTrace();		
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Financial Calculator");
		System.out.println("==================================\n ");
		Money.money();
//		Complex.complex();
		Add();
		Subtract();
		Series.Array();
		write_to_file();
		
	}
}
