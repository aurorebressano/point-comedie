package metier.programmation;

import java.time.LocalDateTime;

public class Representation 
{

	// proprietes d'instance
	private int 			id;
	private int 			placesDisponibles;
	private LocalDateTime 	planning;
	private Double 			prix;
	
	// constructeur
	public Representation(int id, int placesDispo, LocalDateTime planning, Double prix) {
		super();
		this.id = id;
		this.placesDisponibles = placesDispo;
		this.planning = planning;
		this.prix = prix;
	}
	
	// methodes
	public int calculerPlacesDisponibles() 
	{
		//TODO récupérer la jauge de la salle et opérer le calcul
		return 0;
	}

	// getters
	public int getPlacesDisponibles() 
	{
		return placesDisponibles;
	}

	public LocalDateTime getPlanning() 
	{
		return planning;
	}

	public Double getPrix() 
	{
		return prix;
	} 

	public int getId() {
		return id;
	}
	
	// setters
	public void setPlacesDisponibles(int placesDisponibles) 
	{
		this.placesDisponibles = placesDisponibles;
	}

	public void setPlanning(LocalDateTime planning) 
	{
		this.planning = planning;
	}

	public void setPrix(Double prix) 
	{
		this.prix = prix;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
