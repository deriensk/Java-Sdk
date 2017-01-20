public class ThrowsExample{

	public void method1(){
		method2();

	}

	public void method2(){
		method3();

	}

	public void method3(){

		int number = 50/0;

	}

	public static void main(String[] args) {

		ThrowsExample obj = new ThrowsExample();

		
		try{
			obj.method1();
		
		}catch(ArithmeticException e){
			//System.out.println("Mathematical error.");
			e.printStackTrace();
		}

	}
}