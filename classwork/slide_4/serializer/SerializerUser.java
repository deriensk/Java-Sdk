import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializerUser {
	public static void main(String[] args) {

		User usr = new User(1, "admin", "password123");

		FileOutputStream fout = new FileOutputStream("/home/TestFolder/adminpass.txt");

		ObjectOutputStream oops = new ObjectOutputStream(fout);

		//or we can do
		//ObjectOutputStream oops = new ObjectOutputStream("/home/TestFolder/adminpass.txt");

		oops.writeObject(usr);

		oops.flush();
		oops.close();
	}
	
}

//Here the output is in the adminpass text file
//and it contains encrypted form of id, username & password