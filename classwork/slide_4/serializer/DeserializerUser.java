import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializerUser {
	public static void main(String[] args) {

		ObjectInputStream oips = new ObjectInputStream("/home/TestFolder/adminpass.txt");

		User usr = (User) oips.readObject();

		System.out.println(usr);
		

	}
	
}

// id: 1 user: admin password: password123