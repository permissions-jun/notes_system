package moudle;

public class user {
	
	private String id;
	private String user_name;
	private String password;
	
	
	
	public user() {
		super();
		
	}
	
	
	public user(String user_name, String password,String id) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.id=id;
	}
	
	

	public String getId() {
		return id;
	}
	public void setId(String i) {
		this.id = i;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
