package model.entities;

public class User {
	
	private static User instance; 
	private int id;
	private String userName;
	private String password;
	
	public User (String userName, String password) {
		this.userName = userName;
		this.password = password;
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

	public static User getInstance() 
	{
		return instance;
	}
	
}
