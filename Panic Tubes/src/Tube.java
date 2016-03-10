public class Tube extends Type_tuyaux
{
	private boolean est_dans_le_reseau;
	
	public Tube()
	{
		super();
		System.out.println("Creation d'un tube");
		this.est_dans_le_reseau = false;			
	}
	
	public Tube(boolean tubeCoude)
	{
		super(tubeCoude);
		System.out.println("Creation d'un tube Coude");
		this.est_dans_le_reseau = false;			
	}
	
	
	public void move_tube(Tube tube){
		
	}
	
	
	
	public boolean est_un_tuyaux_droit(Tube tube){
		return tube.tuyaux_droit;
	}
	
	public boolean est_dans_le_reseau(Tube tube){
		return tube.est_dans_le_reseau;
	}
}
