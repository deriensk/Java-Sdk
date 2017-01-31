public class User implements Serializable {

	private int id;
	private String username;
	private String password;

	User(int id, String username, String password){
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString(){
		return "id: " + id + " username: " + username + " password: " + password;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}

	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return username;
	}

	public void setPassword(String password){
		this.password = password;
	
	}
	
	public String getPassword(){
		return password;
	}











}