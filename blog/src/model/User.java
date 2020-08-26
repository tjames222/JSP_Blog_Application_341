package model;

public class User {


	private String firstName;

	private String lastName;

	private String userName;

	private String password;

	private String email;
	
	private String phone;

	public User() {
		this.firstName = "";
		this.lastName = "";
		this.userName = "";
		this.password = "";
		this.email = "";
		this.phone = "";
	}
	
	public User(User user) {
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.phone = user.getPhone();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return ("User: " + this.email + " - " + this.firstName + " - " + this.lastName + "\nPhone: " 
				+ this.phone);
	}
}
