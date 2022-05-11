package model.business;
import java.sql.SQLException;

import model.dataccess.LoginDataAccess;

public class LoginBusiness 
{
	private static LoginBusiness instance;
	private String username;
	private String password;
	
	private LoginBusiness(String user, String pass)
	{
		this.username = user;
		this.password = pass;
	}
	
	public static LoginBusiness getInstance()
	{
		if (instance == null)
			instance = new LoginBusiness("","");
			
		return instance;
	}
	
	public boolean verifyCredentials() throws ClassNotFoundException, SQLException
	{
		return LoginDataAccess.getInstance().verifyCredentials();
	}
	
	public void setUserName(String user)
	{
		this.username = user;
	}
	
	public void setPassword(String pass)
	{
		this.password = pass;
	}

}
