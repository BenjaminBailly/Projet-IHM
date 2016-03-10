
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
		model.create_border(length, width);

		for(int i = 0; i < width;i++)
		{
			view.enabled_button(conversion_2D_to_1D(0,i));
			view.enabled_button(conversion_2D_to_1D(length - 1,0));
		}
		
		for(int i = 0; i < length;i++)
		{
			view.enabled_button(conversion_2D_to_1D(i,0));
			view.enabled_button(conversion_2D_to_1D(i,width - 1));
		}
		
	}
	
	public void update_grid()
	{
		
		
		
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
		return size / length;
	}
	
	public int conversion_1D_to_2D_y(int size)
	{
		return size % length;
	}
	
	public int conversion_2D_to_1D(int x,int y)
	{
		return x*length + y;
	}
}
