package metier.programmation;

import java.util.ArrayList;

public class Spectacle {

	// propriétés d'instance
	private int 				id;
	private String 				titre;
	private String 				resume;
	private String 				theme;
	private int 				duree;
	private String 				cheminImage;
	private ArrayList<Artiste> 	artistes;
	private Representations 	representations;
	
	// constructeur 
	public Spectacle
	(	
		int 				id, 
		String 				titre, 
		String 				resume, 
		String 				theme, 
		int 				duree, 
		String 				cheminImage, 
		ArrayList<Artiste> 	artistes, 
		Representations 	representations
	) 
	{
		this.id 				= id;       		     
		this.titre	         	= titre;         	
		this.resume				= resume;               
		this.theme				= theme;                
		this.duree				= duree;         
		this.cheminImage		= cheminImage;     
		this.artistes			= artistes;        	
		this.representations	= representations;
	}
	
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
	public int getDuree() {
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

	public int getId() {
		return id;
	}

	// setters
	public Spectacle setTitre(String titre) {
		this.titre = titre;
		return this;
	}
	
	public Spectacle setResume(String resume) {
		this.resume = resume;
		return this;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public void setDuree(int duree) {
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

	public void setId(int id) {
		this.id = id;
	}

}
