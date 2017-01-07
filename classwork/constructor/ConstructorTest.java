public class ConstructorTest{
	public static void main(String[] args) {
		
		Volume v = new Volume();
		v.showVolume();

		Volume v2 = new Volume();
		v2.showVolume();

		Volume v3 = new Volume(10, 20, 30);
		v3.showVolume();
	}	
}