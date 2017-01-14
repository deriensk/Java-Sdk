package org.javastud.studm.array;

public class IntegerArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("for loop " + arr[i]);
			
		}
		
		//not related to indexing
		for(int no: arr){
			System.out.print(no + "\t");
		}
		System.out.println();
		
		System.out.println("---------continute and break satements-------");
		for (int i = 0; i<10 ; i++) {
			if (i%2 == 0){
				continue;
				
			}
			System.out.print(i + "\t");
			
	}
		
	public void showPrime(int no){
		if(no <=0 ){
			return;
		}
		
		for (int i = 0; i < no.length; i++) {
			
		}
	}
		
	public double area(double r){
		return Math.PI * r * r;
	
	}

}
