package metier.programmation;

import java.util.ArrayList;

public class Representations extends ArrayList<Representation> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// propriete d'instance
	private int 	id;
	private Salle 	salle;

	// getters
	public Salle getSalle() {
		return salle;
	}

	public int getId() {
		return id;
	}

	// setters
	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
