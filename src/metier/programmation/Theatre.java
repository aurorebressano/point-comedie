package metier.programmation;

public class Theatre {

	// proprietes d'instance
	private String 	nom;
	private String 	resume;
	private String 	libAdr;
	private String 	cheminImage;
	
	// constructeur
	public Theatre(String nom, String resume, String libAdr, String cheminImage) {
		super();
		this.nom = nom;
		this.resume = resume;
		this.libAdr = libAdr;
		this.cheminImage = cheminImage;
	}
	
	// getters
	public String getNom() {
		return nom;
	}
	public String getResume() {
		return resume;
	}
	public String getLibAdr() {
		return libAdr;
	}
	public String getCheminImage() {
		return cheminImage;
	}
	
	// setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public void setLibAdr(String libAdr) {
		this.libAdr = libAdr;
	}
	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}
	
}
