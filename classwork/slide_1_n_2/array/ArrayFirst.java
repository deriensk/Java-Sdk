public class ArrayFirst{

	public static void main(String[] args) {
		int[] myIntArray = new int[25];   
		//myIntArray[5] = 50;

		for(int i=0; i<myIntArray.length; i++) {
			myIntArray[i] = i*10;
			
		}
		printArray(myIntArray);
		

	}

	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Element " + i + " has value " + array[i]);
			
		}
		
	}

}

