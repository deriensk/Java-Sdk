class RunnableExample implements Runnable {

	@Override 
	public void run(){
		System.out.println("I am from inside the class");
	}

	public static void main(String[] args) {
			
		//method one
		RunnableExample obj = new RunnableExample();
		Thread threadOne = new Thread(obj);
		threadOne.start();

		//method 2
		Runnable obj2 = new Runnable(){

			@Override
			public void run(){
				System.out.println("From anonymous Runnable instance.")
			}

		};

		Thread threadTwo = new Thread(obj2)
		threadTwo.start();
	}
	
}