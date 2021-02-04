package metier;

import java.time.LocalDate;

public class Representation {

	// proprietes d'instance
	private int placesDisponibles;
	private LocalDate planning;
	private Double prix;
	
	// methodes
	public int calculerPlacesDisponibles() {
		//TODO récupérer la jauge de la salle et opérer le calcul
		return 0;
	}

	// getters
	public int getPlacesDisponibles() {
		return placesDisponibles;
	}

	public LocalDate getPlanning() {
		return planning;
	}

	public Double getPrix() {
		return prix;
	}
	
	// setters
	public void setPlacesDisponibles(int placesDisponibles) {
		this.placesDisponibles = placesDisponibles;
	}

	public void setPlanning(LocalDate planning) {
		this.planning = planning;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
}
