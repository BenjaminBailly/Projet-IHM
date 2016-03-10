
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
		init_grid_of_case(length,width);
		init_grid_of_case_presence(length,width);
		
	}
	
	public void init_grid_of_case(int length, int width)
	{
		for (int i = 0; i < length; i++)
		{
			for( int j = 0; j < width; j++)
			{
				grid_of_case[i][j]= new Case();
			}
		}
	}
	
	public void init_grid_of_case_presence(int length, int width)
	{
		for (int i = 0; i < length; i++)
		{
			for( int j = 0; j < width; j++)
			{
				grid_of_case_presence[i][j]= true;
			}
		}
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
	
	public Case get_grid_of_case(int x, int y)
	{
		return grid_of_case[x][y];
	}
	
	public void create_entrance(int length)
	{
		int random_int = 1 + (int)(Math.random() * (((length-1) - 1) + 1));
		grid_of_case[random_int][0].becomes_the_entrance();
	}
	
	public void create_exit(int length,int width)
	{
		int random_int = 1 + (int)(Math.random() * (((length-1) - 1) + 1));
		grid_of_case[random_int][width-1].becomes_the_exit();
	}
}
