
public class Type_tuyaux {
	protected String nom;
	protected boolean tuyaux_droit;
	
	public Type_tuyaux()
	{
		this.nom = "tuyaux droit";
		tuyaux_droit = true;
		
	}
	
	public Type_tuyaux(boolean tuyaux_non_droit)
	{
		this.nom = "tuyaux courbe";
		tuyaux_droit = tuyaux_non_droit;
	}
	
}
