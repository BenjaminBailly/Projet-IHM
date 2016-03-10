
public class Controler 
{
	private View view;
	private Model model;
	
	private int length;
	private int width;
	
	Controler()
	{
		
	}
	
	public void link_controler(View view, Model model)
	{
		this.view = view;
		this.model = model;
	}
	
	public void prepare_grid(int length,int width)
	{
		this.length = length;
		this.width = width;
		model.set_grid_size(length, width);
		model.create_border(length, width);
		model.create_entrance(length);
		model.create_exit(length,width);
		update_grid();
	}
	
	public void update_grid()
	{
		for(int i = 0; i < length; i++)
		{
			for( int j = 0; j < width; j++)
			{
				if(this.model.get_grid_of_case(i, j).is_this_case_an_obstacle())
				{
					view.enabled_button(conversion_2D_to_1D(i,j));
				}
				
				if(this.model.get_grid_of_case(i, j).is_this_case_the_entrance())
				{
					view.enabled_button_entrance(conversion_2D_to_1D(i,j));
				}
				
				if(this.model.get_grid_of_case(i, j).is_this_case_the_exit())
				{
					view.enabled_button_exit(conversion_2D_to_1D(i,j));
				}
			}
		}
		
		
	}
	
	
	public int get_length()
	{
		return this.length;
	}
	
	public int get_width()
	{
		return this.width;
	}
	

	public int conversion_1D_to_2D_x(int size)
	{
		return size / width;
	}
	
	public int conversion_1D_to_2D_y(int size)
	{
		return size % width;
	}
	
	public int conversion_2D_to_1D(int x,int y)
	{
		return x*width + y;
	}
}
