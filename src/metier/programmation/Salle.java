package metier.programmation;

public class Salle {

	// prorpietes d'instance
	private String nom;
	private int jauge;
	
	// getters
	public String getNom() {
		return nom;
	}
	protected int getJauge() {
		return jauge;
	}
	
	// setters
	public void setNom(String nom) {
		this.nom = nom;
	}
}
