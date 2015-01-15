package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;


public class Reader extends User
{
	public void setUsername(String x) throws IOException{
		if (x.length() <= 8){
			throw new IOException("Name is too short");
		}
		this.username = x;
	}
}
