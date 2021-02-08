package metier.programmation;

import java.util.ArrayList;

public class Representations extends ArrayList<Representation> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// propriete d'instance
	private Salle salle;

	// getters
	public Salle getSalle() {
		return salle;
	}

	// setters
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	
}
