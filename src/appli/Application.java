package appli;

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
		
		// je recupere le calendrier 
		
		Calendar calendar = Calendar.getInstance();
		
		ArrayList<LocalDateTime> datesDispo = new ArrayList<LocalDateTime>();
		return datesDispo;
	}
}
