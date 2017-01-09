public class User{

	private int id;
	private String name;
	private String email;

	public User(int id, String name, String email){

		this.id = id;
		this.name = name;
		this.email = email;
	}	
	public String toString(){
		return "id:  " + id + " name: " + name + " email: " + email;
	}

	public static void main(String[] args) {
		User usr = new User(1, "Mike", "mike@gmail.com");
		System.out.println(usr);
	}

	
}