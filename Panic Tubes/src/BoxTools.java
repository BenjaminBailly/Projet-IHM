
public class BoxTools {
	private int nombre_de_tuyaux_droit;
	private int nombre_de_tuyaux_coude;
	
	public BoxTools(int nb_droit, int nb_coude)
	{
		this.nombre_de_tuyaux_coude = nb_coude;
		this.nombre_de_tuyaux_droit = nb_droit;
	}
	
	public int get_nb_tuyaux_totaux(){
		return (nombre_de_tuyaux_droit + nombre_de_tuyaux_coude);
	}
	
	public int get_nb_tuyaux_droit(){
		return (nombre_de_tuyaux_droit);
	}
	
	public int get_nb_tuyaux_coude(){
		return (nombre_de_tuyaux_coude);
	}
	
}
