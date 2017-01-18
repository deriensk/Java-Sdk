import java.util.Scanner;

public class ArraySortChallange{

	public static Scanner scanner = new Scanner(System.in);


	public static int[] getIntegers(int number){
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
		
	}
	public static void main(String[] args) {
		int[] myInteger = getIntegers(5);
		for (int i = 0; i < myInteger.length; i++) {
			System.out.println("Element " + i + " has value: "  + myInteger[i] + "\t");
			
		}
		
	}
}