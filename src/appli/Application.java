package appli;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {
	
	/**
	 * Generation des dates qui se situent dans un intervalle de dates donne
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
