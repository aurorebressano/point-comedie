package metier;

public abstract class Spectacle {

	// propriétés d'instance
	private String titre;
	private String resume;
	private String theme;
	private String duree;
	private String cheminImage;
	
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
	
	
}
