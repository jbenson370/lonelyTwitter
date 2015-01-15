package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

//look at abstract classes and methods
public abstract class User extends Object
{
	protected String username;
	private int friendCount;

	
	public String getUsername()
	{
	
		return username;
	}

	
	public void setUsername(String k) throws IOException
	{
	
		username = k;
	}


	public User(String username)
	{

		super();
		this.username = username;
		this.friendCount = 0;
	}
	
	public User()
	{

		super();
		this.username = "NewUser";
		this.friendCount = 0;
	}
	
}