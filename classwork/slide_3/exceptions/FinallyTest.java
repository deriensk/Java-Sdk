import java.util.Scanner;


public class FinallyTest{
	public static void main(String[] args) {

		Scanner sc = null;
		
		try{
			sc = new Scanner(System.in);

			System.out.println("Enter any number: ");

			double number = sc.nextInt();

			System.out.println("500/number is: " + 500/number);

			sc.close();
		
		}catch(Exception e){
			e.printStackTrace();
		
		}finally{
			sc.close();
		}
	}
}