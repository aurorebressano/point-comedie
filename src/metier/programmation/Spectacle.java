package metier.programmation;

import java.util.ArrayList;

import java.util.ArrayList;

public abstract class Spectacle {

	// propriétés d'instance
	private String titre;
	private String resume;
	private String theme;
	private String duree;
	private String cheminImage;
	private ArrayList<Artiste> artistes;
<<<<<<< HEAD:src/metier/programmation/Spectacle.java
	private Representations representations;

=======
	private Salle salle;
	
>>>>>>> be1fbfe4d9ae11ce78ce9bc0df8df66ea37846fe:src/metier/Spectacle.java
	// getters
	public String getTitre() {
		return titre;
	}
	public String getResume() {
		return resume;
	}
	public String getTheme() {
		return theme;
	}
	public String getDuree() {
		return duree;
	}
	public String getCheminImage() {
		return cheminImage;
	}
	public ArrayList<Artiste> getArtistes() {
		return artistes;
	}
<<<<<<< HEAD:src/metier/programmation/Spectacle.java
	public Representations getRepresentations() {
		return representations;
	}

=======
	public Salle getSalle() {
		return salle;
	}
	
>>>>>>> be1fbfe4d9ae11ce78ce9bc0df8df66ea37846fe:src/metier/Spectacle.java
	// setters
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}
	public void setArtistes(ArrayList<Artiste> artistes) {
		this.artistes = artistes;
	}
<<<<<<< HEAD:src/metier/programmation/Spectacle.java
	public void setRepresentations(Representations representations) {
		this.representations = representations;
	}


}
=======
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	
}
>>>>>>> be1fbfe4d9ae11ce78ce9bc0df8df66ea37846fe:src/metier/Spectacle.java
