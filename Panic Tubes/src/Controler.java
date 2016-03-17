import java.util.Random;

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
		placerMines(5);
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
	
	
	
	
	//Fonction pour placer un nombre d'obstacles n aléatoirement
    public void placerMines(int obstacle){
        int nbObsctacle = obstacle;
        if(nbObsctacle < this.length +1* this.width+1){
            while(nbObsctacle > 0)
            {
                int i = Controler.randomInt(0, this.length -1);
                int j = Controler.randomInt(0, this.width -1);
                if(!this.model.get_grid_of_case(i,j).is_this_case_an_obstacle() ){
                	this.model.get_grid_of_case(i,j).becomes_an_obstacle();
                    nbObsctacle --;
                }
            }
        }
        else{
            System.out.println("Erreur : Il y a trop de d'obstacle par rapport au nombre de case...");
        }
    }
    
    public Case get_entrance()
    {
    	int i = 0;
    	Case entrance = new Case();
    	for (int j = 0 ; j < length -1 ; j++){
    		if (this.model.get_grid_of_case(j,i).is_this_case_the_entrance()){
    			entrance = this.model.get_grid_of_case(j, i);
    		}
    	}
    	return entrance;
    }
    
    public Case get_exit()
    {
    	int i = width - 1;
    	Case exit = new Case();
    	for (int j = 0 ; j < length -1 ; j++){
    		if (this.model.get_grid_of_case(j, i).is_this_case_the_entrance()){
    			exit = this.model.get_grid_of_case(j, i);
    		}
    	}
    	return exit;
    }
    
    
   /*  public boolean is_in_entrance_zone(int x, int y)
    {
    // recupere les coordonnées de l'entrée
    
    // zone entrance 
    x+1,y+1
    x+1, y+2
    x+1, y
    x+2, y
    x+2, y-1
    x+1,y-1
    
    
    	
    }*/
    
    
  //Fonction permettant de générer un entier entre min et max
    public static int randomInt(int min, int max){
        Random rand = new Random();
        int randomInt = rand.nextInt((max - min) + 1) + min;
        return randomInt;
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
