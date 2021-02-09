package metier.programmation;

import java.time.LocalDateTime;

public class Representation 
{

	// proprietes d'instance
	private int placesDisponibles;
	private LocalDateTime planning;
	private Double prix;
	
	// constructeur
	public Representation(int placesDispo, LocalDateTime planning, Double prix) {
		super();
		this.placesDisponibles = placesDispo;
		this.planning = planning;
		this.prix = prix;
	}
	
	// methodes
	public int calculerPlacesDisponibles() 
	{
		//TODO r�cup�rer la jauge de la salle et op�rer le calcul
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
	
	
}
