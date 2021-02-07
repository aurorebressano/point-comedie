package appli;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

import dao.Dao;
import metier.programmation.Representation;

public class Application {

	/**
	 * Rercherche, par theatre et par salle, des dates sur lesquelles aucune 
	 * représentation n'est programmée
	 * 
	 * @return (<b><i>datesDispo</i></b>) la liste des dates disponibles
	 */
	public ArrayList<LocalDate> rechercherDatesDispo() {
		
		// je recupere les dates entrees par l'utilisateur (pour l'instant en dur)
		//TODO recuperer les dates entrées par l'utilisateur sur la page adminTheatre.jsp
		int endDay = 8;
		ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
		LocalDate start = LocalDate.of(2021, 4, 1);
		LocalDate end = LocalDate.of(2021, 2, endDay + 1);
		dates = getDatesRange(start, end);
		
		// je recupere les dates des representations 
		ArrayList<Representation> representations = Dao.representations;			// Recupere la liste des represenations dans Dao
		ArrayList<LocalDate> planningRepres = new ArrayList<LocalDate>();			// Declare une nouvelle liste de dates
		for (Representation repres : representations) {								
			LocalDateTime planning = repres.getPlanning();							
			int year = planning.getYear();
			int month = planning.getMonthValue();
			int day = planning.getDayOfMonth();
			LocalDate planningDate = LocalDate.of(year, month, day);
			planningRepres.add(planningDate);										// Ajoute les dates de representations dans la 
		}																			// nouvelle liste
		
		
		// Je cherche les dates de l'intervalle pour lesquelles il n'y a pas de representation et je les mets dans une liste
		ArrayList<LocalDate> datesDispo = new ArrayList<LocalDate>();
		for (LocalDate intervalleDate : dates) {
			for (LocalDate date : planningRepres)  {
				if(!date.isEqual(intervalleDate)) {
					datesDispo.add(intervalleDate);
				}
			}
		}
		
		System.out.println(datesDispo);
		return datesDispo;
	}
	
	/**
	 * Generation des dates qui se situent dans un intervalle donne
	 * 
	 * @param start	date de debut de periode
	 * @param end	date de fin de periode
	 * 
	 * @return (<b><i>datesRange</i></b>) la liste des dates qui se situent entre <b><i>start</i></b> et <b><i>end</i></b>
	 */
	public static ArrayList<LocalDate> getDatesRange (LocalDate start, LocalDate end) {
		
		ArrayList<LocalDate> datesRange = new ArrayList<LocalDate>();
		
		LocalDate localDate = start;
		while (localDate.isBefore(end)) {
		    datesRange.add(localDate);
		    // Set up the next loop.
		    localDate = localDate.plusDays(1);
		}
		return datesRange;
	}
	
}
