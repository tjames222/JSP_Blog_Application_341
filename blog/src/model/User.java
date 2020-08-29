package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	////////// Properties
	@NotNull(message="Please enter first name.")
	@Size(min=1, max=100, message="Please enter within min/ max character range.")
	private String firstName;
	
	@NotNull(message="Please enter last name.")
	@Size(min=1, max=100, message="Please enter within min/ max character range.")
	private String lastName;
	
	@NotNull(message="Please enter user name.")
	@Size(min=1, max=100, message="Please enter within min/ max character range.")
	private String userName;
	
	@NotNull(message="Please enter password.")
	@Size(min=1, max=100, message="Please enter within min/ max character range.")
	private String password;
	
	@NotNull(message="Please enter email.")
	@Size(min=1, max=100, message="Please enter within min/ max character range.")
	private String email;
	
	@NotNull(message="Please enter phone.")
	@Size(min=1, max=100, message="Please enter within min/ max character range.")
	private String phone;

	////////// Default constructor
	public User() {
		this.firstName = "";
		this.lastName = "";
		this.userName = "";
		this.password = "";
		this.email = "";
		this.phone = "";
	}
	
	////////// Constructor that takes a User object as a parameter
	public User(User user) {
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.phone = user.getPhone();
	}

	////////// Getters and setters
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
	
	////////// To string method
	@Override
	public String toString() {
		return ("User: " + this.email + " - " + this.firstName + " - " + this.lastName + "\nPhone: " 
				+ this.phone);
	}
}
