
public class Model 
{
	private Controler controler;
	private View view;
	
	private Case[][] grid_of_case;
	private boolean[][] grid_of_case_presence;
	
	Model()
	{
		
	}
	
	public void link_model(View view, Controler controler)
	{
		this.view = view;
		this.controler = controler;
	}
	
	public void set_grid_size(int length, int width)
	{
		this.grid_of_case = new Case[length][width];
		this.grid_of_case_presence = new boolean[length][width];
	}
	
	public void this_case_become_an_obstacle(int length, int width)
	{
		grid_of_case[length][width].becomes_an_obstacle();
	}
	
	public void create_border(int length,int width)
	{
		for(int i = 0; i < width;i++)
		{
			grid_of_case[0][i].becomes_an_obstacle();
			grid_of_case[length - 1][i].becomes_an_obstacle();
		}
		
		for(int i = 0; i < length;i++)
		{
			grid_of_case[i][0].becomes_an_obstacle();
			grid_of_case[i][width - 1].becomes_an_obstacle();
		}
	}
}
