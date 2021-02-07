package appli;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class Application {

	/**
	 * Rercherche, par theatre et par salle, des dates sur lesquelles aucune 
	 * représentation n'est programmée
	 * 
	 * @return (<b><i>datesDispo</i></b>) la liste des dates disponibles
	 */
	public ArrayList<LocalDateTime> rechercherDatesDispo() {
		
		// je recupere les dates entrees par l'utilisateur (pour l'instant en dur)
		//TODO recuperer les dates entrées par l'utilisateur sur la page adminTheatre.jsp
		int endDay = 7;
		ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
		LocalDate start = LocalDate.of(2021, 1, 1);
		LocalDate end = LocalDate.of(2021, 2, endDay + 1);
		dates = getDatesRange(start, end);
		
		// je recupere les dates des representations 
		
		
		ArrayList<LocalDateTime> datesDispo = new ArrayList<LocalDateTime>();
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
		
		ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
		
		LocalDate localDate = start;
		while (localDate.isBefore(end)) {
		    dates.add(localDate);
		    // Set up the next loop.
		    localDate = localDate.plusDays(1);
		}
		return dates;
	}
	
}
