package Labwork6;
import java.util.InputMismatchException;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Labwork6 {
//	In each word of the text, replace the k-th letter with the specified character.
//	If k is greater than the length of the word, the correction is not performed.


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "Windows-1251");
		System.out.println("Enter Statement = ");
		String text = sc.nextLine();
		System.out.println("Replacement = ");
		char rep = sc.next().charAt(0);
		System.out.println("k-th term = ");
		int k = sc.nextInt();
		
		String word[] = text.split(" ");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(word);
        // Creating array of string length
		for(String x: al){
        char[] ch = new char[x.length()];
    	
        // Copy character by character into array
        if (x.length() >= k){
        	for (int i = 0; i < x.length(); i++) {
        		ch[i] = x.charAt(i);
            }
        	ch[k-1] = rep;
        }
        else
        	System.out.println(x);

        
		String str = String.valueOf(ch);
        System.out.println(str);
		}
	}
	}
	

