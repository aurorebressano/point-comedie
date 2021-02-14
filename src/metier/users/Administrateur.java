package metier.users;

import metier.users.Administrateur;
import metier.users.Password;

public class Administrateur {

	private String 		idAbonne;
	private String 		nom;
	private String 		prenom;
	private Password    pw;
	private String      email;
	
	/**
	 * constructeur incorrect  
	 * en attente de l'implementation dans la base
	 * @param idAbonne
	 */
	public Administrateur(String idAbonne) {
		this.idAbonne 	= idAbonne;
		this.nom 		= "inconnu";
	}
	
	public Administrateur(String idAbonne, String nom, String prenom) {
		this.idAbonne 	= idAbonne;
		this.nom 		= nom;
		this.prenom 	= prenom;
	}
	public Administrateur(String idAbonne, String nom, String prenom, Password pw) {
		this(idAbonne, nom, prenom);
		this.pw			= pw;
	}
	public Administrateur(String idAbonne, String nom, String prenom, Password pw, String email) {
		this(idAbonne, nom, prenom, pw);
		this.email			= email;
	}

	public String getIdAbonne() {
		return idAbonne;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Password getPw() {
		return pw;
	}
	public String getEmail() {
		return email;
	}

	public void setIdAbonne(String idAbonne) {
		this.idAbonne = idAbonne;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setPw(Password pw) {
		this.pw = pw;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		boolean retour = false;
		if (obj != null && obj instanceof Administrateur) {
			Administrateur abonne = (Administrateur)obj;
			retour = abonne.getIdAbonne().equals(this.idAbonne) ;
		}
		return retour;
	}

	// l'affichage du pw est juste pour le développement !!!
	@Override
	public String toString() {
		return "Administrateur [" + idAbonne + ", " + nom + ", " + prenom + ", " + email + ", " + pw +"]";
	}
	
}
