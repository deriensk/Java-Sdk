import java.util.Scanner;

public class UserInput2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter array length: ");

		int size = sc.nextInt();

		int[] ar = new int[size];

		for (int i =0; i< ar.length ; i ++ ) {
			System.out.println("Enter element: " + i );
			ar[i] = sc.nextInt();
		}

		//Printing the i/p values

		System.out.println("User input values are:-");	
		for (int i =0; i < ar.length ; i++ ) {
			System.out.print(ar[i] + "\t");
		}

		//String array
		/*System.out.println();
		String[] fruits = {"apple", "banana", "mango", "orange"};
		for (int i=0; i<fruits.length ; i++ ) {
			System.out.print(fruits[i] + "\t");
			
		}*/

		
	}
}

/*
py 2.7 

l = []

size = int(raw_input("Enter size for array:"))

for i in xrange(0,size):
	l.append(raw_input("Enter element " + str(i) + ": "))

print("User input values are:")

for i in l:
	print i,
*/