public class Vehicle{

	private String color;
	public int speed;
	protected int size;

	Vehicle(){
		System.out.println("I am from constructor");
	}

	public void printVehicle(){
		System.out.println("Color is: " + getColor());
		System.out.println("Speed is: " + speed);
		System.out.println("Size is: " + size);
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}
}