package ca.ualberta.cs.lonelytwitter;

// this is a sub class of User so it gains all of users methods. 
public class Author extends User
{
	@Override
	public void setUsername(String x){
		if (x.length() > 8){
			throw new RuntimeException("Name is too long");
		}
		this.username = x;
	}
}
