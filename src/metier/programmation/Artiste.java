package metier.programmation;

import java.time.LocalDate;

public class Artiste {

	//propriétés d'instance
	private String nom;
	private String prenom;
	private String resume;
	private LocalDate dateNaiss;
	private String cheminImage;
	
	// constructeur
	public Artiste (String nom, String prenom, String resume, String cheminImage) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.resume = resume;
		this.cheminImage = cheminImage;
	}
	
	// getters
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getResume() {
		return resume;
	}
	public LocalDate getDateNaiss() {
		return dateNaiss;
	}
	public String getCheminImage() {
		return cheminImage;
	}
	
	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}
}
