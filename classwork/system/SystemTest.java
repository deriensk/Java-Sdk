import java.util.Scanner;

public class SystemTest {
	public static void main(String[] args) {
		System.out.println("Please provide the following information...");
		System.err.println("I am red");
		
		
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter roll no: ");
	    int roll = sc.nextInt();
	    System.out.println("Your name is " + name + " and " + "Roll no. is " + roll);
	}

}
