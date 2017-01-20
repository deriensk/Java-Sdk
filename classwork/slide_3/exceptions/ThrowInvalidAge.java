import java.util.Scanner;

public class ThrowInvalidAge{

	public static void validateAge(int age){

		if (age <= 17){
			InvalidAgeException e = new InvalidAgeException("Age " + age +
									" is not valid for voting.");
			throw e;
		}else{
			System.out.println("You are eligible for voting.");
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter your age: ");

		Scanner scanner = new Scanner(System.in);

		int yourAge = scanner.nextInt();
		
		try{
			validateAge(yourAge);

		}catch(InvalidAgeException e2){
			e2.printStackTrace();
		}finally{
			scanner.close();
		}
	}
	
}