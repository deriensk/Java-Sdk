public class Employee{

	private int id;
	private String name;
	private String email;

	//set attr

	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	@Override
	public String toString(){
		return " id: " + id + ", name: " + name + ", email: " + email;
	}
}