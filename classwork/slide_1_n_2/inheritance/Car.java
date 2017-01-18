class Car extends Vehicle{

	private int cc;
	private int gear;

	Car(){
		super();
	}

	public void printCar(){
		printVehicle();
		System.out.println("CC is: " + cc);
		System.out.println("Gear is: " + gear);
	}


	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.cc = 1200;
		c1.gear = 6;
		c1.setColor("White");
		c1.speed = 200;
		c1.size = 20;
		System.out.println("=====ans====");
		c1.printCar();
	}
	
}