package metier.programmation;

import java.util.ArrayList;

public abstract class Spectacle {

	// propriétés d'instance
	private String titre;
	private String resume;
	private String theme;
	private String duree;
	private String cheminImage;
	private ArrayList<Artiste> artistes;
	private Representations representations;

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
	public Representations getRepresentations() {
		return representations;
	}

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
	public void setRepresentations(Representations representations) {
		this.representations = representations;
	}


}