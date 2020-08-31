package model;

public class userTable {

	int id;
	String User;
	String Password;
	
	public userTable(int id, String User, String Password) {
		super();
		this.id = id;
		this.User = User;
		this.Password = Password;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public string getPassword() {
		return Password;
	}
	public void setPassword(string password) {
		Password = password;
	}
	
}