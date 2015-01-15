package ca.ualberta.cs.lonelytwitter;


public class Friends implements Relationships
{
	private String name;
	private String dateAdded;
	public String howClose;
	
	public String getName()
	{
	
		return name;
	}
	
	public void setName(String name)
	{
	
		this.name = name;
	}

	
	public String getDateAdded()
	{
	
		return dateAdded;
	}

	
	public void setDateAdded(String dateAdded)
	{
	
		this.dateAdded = dateAdded;
	}

	public Friends(String name, String currentDate)
	{

		super();
		this.name = name;
		this.dateAdded = currentDate ;
	}
	public void setRelation(String x)
	{
		this.howClose = x;
	}
	
	
}
