import java.util.Scanner;

public class UserinputAverage {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		//int[] myIntegers = new int[5];
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + " typed value was " + myIntegers[i]);
		}
		System.out.println("The average is "  + getAverage(myIntegers));
	}
	
	public static int[] getIntegers(int number){
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double) sum / (double) array.length;
	}
}	

//incomplete

/*def getIntgers(number):
	
	print("Enter " +  str(number) +  " integer values.\n")
	
	values = []

	for x in range(1, number+1):
		a = int(raw_input())
		values.append(a)
	return values
	
def getAverage(array):

	total_sum = 0
	for i in range(len(array)):
		total_sum += array[i]
	return total_sum / len(array)	


 
myIntegers = getIntegers(5)


# for i in range(5):
# 	print ("Element " + str(i) + " has typed value " + str(myIntegers[i])	
*/