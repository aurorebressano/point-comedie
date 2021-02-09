package metier.programmation;

import java.time.LocalDate;
import java.util.ArrayList;

import appli.Application;
import dao.Dao;

public class Salle {

	// prorpietes d'instance
	private String nom;
	private int jauge;
	private Theatre theatre;
	
	// methode
	/**
	 * Rercherche, par theatre et par salle, des dates sur lesquelles aucune 
	 * représentation n'est programmée
	 * 
	 * @return (<b><i>datesDispo</i></b>) la liste des dates disponibles
	 */
	public ArrayList<LocalDate> rechercherDatesDispo(LocalDate start, LocalDate end) {
		
		// je recupere l'intervalle de dates entre par l'utilisateur (pour l'instant en dur)
		//TODO recuperer l'intervalle entre par l'utilisateur sur la page adminTheatre.jsp
		if (start == null) {
			start = LocalDate.now();
		} 
		
		if(end == null) {
			end = LocalDate.now().plusMonths(3);
		}
		
		ArrayList<LocalDate> interval = Application.getDatesRange(start, end);

		// je recupere les dates des representations dans la dao
		ArrayList<Representation> representations = Dao.getRepresentations();

		// je filtre la liste des dates pour ne garder que les dates libres
		interval = this.filtrerIntervalleParRepresentations(interval, representations);
		
		return interval;
	}
	
	/**
	 * Filtre l'intervalle de dates donné en supprimant les dates de représentations
	 * @param representations
	 * @param interval
	 * @return (<b><i>interval</i></b>) l'intervalle filtré
	 */
	private ArrayList<LocalDate> filtrerIntervalleParRepresentations(ArrayList<LocalDate> interval, ArrayList<Representation> representations) {
		
		// pour chaque date de représentation, je cherche la date de l'intervalle qui lui correspond 
		// et je la supprime de la liste des dates de l'intervalle
		for (Representation representation : representations) {								
			LocalDate representationDate = representation.getPlanning().toLocalDate();
			for (int i = 0; i <= interval.size(); i++) {
				if (representationDate.isEqual(interval.get(i))) {
					interval.remove(i);
					break;
				}
			}
		}
		
		return interval;
	}
	
	// getters
	public String getNom() {
		return nom;
	}
	public int getJauge() {
		return jauge;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	
	// setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
}
