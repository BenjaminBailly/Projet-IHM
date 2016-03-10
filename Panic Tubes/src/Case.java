
public class Case 
{
	private boolean is_an_obstacle;
	private boolean is_entrance;
	private boolean is_exit;
	
	Case()
	{
		this.is_an_obstacle = false;
		this.is_entrance = false;
		this.is_exit = false;
	}
	
	public boolean is_this_case_an_obstacle()
	{
		return is_an_obstacle;
	}
	
	public void becomes_an_obstacle()
	{
		this.is_an_obstacle = true;
	}
	
	public boolean is_this_case_the_entrance()
	{
		return this.is_entrance;
	}
	
	public void becomes_the_entrance()
	{
		this.is_entrance = true;
	}
	
	public boolean is_this_case_the_exit()
	{
		return this.is_exit;
	}
	
	public void becomes_the_exit()
	{
		this.is_exit = true;
	}
}
