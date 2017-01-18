/**
 *  This class is to show the student courses.
 * @author sudhamsu
 * @see student
 * @since 1969
 *
 */

public class Course {

	// Constant(final)
	public static final double PI = 3.14;

	private String course = "Core Java";

	void showJavaCourse() {

		System.out.println("Course name is: " + course);

	}

	public void showAdvCourse() {

		System.out.println("Course name is: Adv java course");

	}

	void calcArea(double r) {
		double area = PI * r * r;
		System.out.println("Area is: " + area);
	}



	public static void main(String[] args){
		
		Course c = new Course();
		c.showJavaCourse();
		c.showAdvCourse();
		c.calcArea(5.5);
		System.out.println(Course.PI);

	}	
}



public static void main(String[] args){

	String course = "JAVA";

	PI = 3.1415;

	void showcourse(){
		System.out.println("The course name is" + course);
	}

	void clacArea(double r){
		area = PI * r * r;
		System.out.println('Area of circle is: ')
	}

	public static void main(String[] args){
		Course cc = Course();
		cc.showcourse();
		cc.clacArea(9.9);
	}
}
