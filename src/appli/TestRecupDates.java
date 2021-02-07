package appli;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import dao.Dao;
import metier.programmation.Representation;

public class TestRecupDates {

	public static void main(String[] args) {
		
		// je recupere l'intervalle de dates entre par l'utilisateur (pour l'instant en dur)
		//TODO recuperer l'intervalle entre par l'utilisateur sur la page adminTheatre.jsp
		int endDay = 8;
		LocalDate start = LocalDate.of(2021, 4, 1);
		LocalDate end = LocalDate.of(2021, 4, endDay + 1);
		ArrayList<LocalDate> interval = getDatesRange(start, end);

		// je recupere les dates des representations 
		ArrayList<Representation> representations = Dao.representations;			// Recupere la liste des represenations dans Dao
		ArrayList<LocalDate> representationsDates = new ArrayList<LocalDate>();			// Declare une nouvelle liste de dates
		for (Representation representation : representations) {								
			LocalDate planning = representation.getPlanning().toLocalDate();
			representationsDates.add(planning);										// Ajoute les dates de representations dans la 
		}																			// nouvelle liste

		// je cherche les dates qui ont des representations et je les supprime
		for (LocalDate representationDate : representationsDates) {
			for(int i=0; i<= interval.size(); i++) {
				if(representationDate.isEqual(interval.get(i))) {
					interval.remove(i);
					break;
				}
			}
		}

		// Je cherche les dates de l'intervalle pour lesquelles il n'y a pas de representation et je les mets dans une liste
//		ArrayList<LocalDate> datesDispo = new ArrayList<LocalDate>();
//		for (LocalDate intervalleDate : dates) {
//			for(int i=0; i<dates.size(); i++) {
//				if(!intervalleDate.isEqual(planningRepres.get(i))) {
//					datesDispo.add(intervalleDate);
//				}
//			}
//		}

		System.out.println(interval);
//		int endDay = 7;
//		
//		ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
//		LocalDate start = LocalDate.of(2021, 1, 1);
//		LocalDate end = LocalDate.of(2021, 2, endDay + 1);
//		dates = datesRange(start, end);
//		
//		LocalDate localdate = start;
//		while (localdate.isBefore(end)) {
//		    System.out.println(localdate);
//		    // Set up the next loop.
//		    localdate = localdate.plusDays(1);
//		}
	}
	
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
