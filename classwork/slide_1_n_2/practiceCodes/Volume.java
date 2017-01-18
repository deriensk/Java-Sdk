public class Volume{
	
	private int length;
	private int breadth;
	private int height;

	//Default constructor
	public Volume(){

	}

	//Parameterized constuctor

	public Volume(int length, int breadth, int height){
		this.length = length;
		this.breadth =  breadth;
		this.height = height;
	}

	public void showVolume(){
		int volume = length * breadth * height;
		System.out.println("Volume is: " + volume);

	}

	public void showArea(){
		int area = length * breadth;
		System.out.println("Area is: " + area);
	}

}