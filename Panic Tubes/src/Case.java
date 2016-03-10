
public class Case 
{
	private boolean is_an_obstacle;
	
	Case()
	{
		this.is_an_obstacle = false;
	}
	
	public boolean is_this_case_an_obstacle()
	{
		return is_an_obstacle;
	}
	
	public void becomes_an_obstacle()
	{
		this.is_an_obstacle = true;
	}
}
