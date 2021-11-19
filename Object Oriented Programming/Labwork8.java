package Labwork8;
import java.util.ArrayList;
import java.util.List;
public class Labwork8 {
	public static void main(String[] args) {
	List<Integer>numbers = new ArrayList<>(List.of(-1, 0, 4, 5, -2, 8, 12, 3));
	numbers.removeIf(n-> n % 2 != 0);
	System.out.println("Generic method output = "+numbers);
	}
}
