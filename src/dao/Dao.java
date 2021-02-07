package dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import metier.programmation.Artiste;
import metier.programmation.Representation;

public class Dao {

	public static ArrayList<Artiste> artistes = initArtiste();
	public static ArrayList<Representation> representations = initRepresentations();
	
	private static ArrayList<Artiste> initArtiste() {
		ArrayList<Artiste> liste = new ArrayList<Artiste>();
		liste.add(new Artiste(
				"Mergault", 
				"Isabelle", 
				"Isabelle Mergault, n�e le 11 mai 1958 dans le 14e arrondissement de Paris, est une actrice, r�alisatrice, sc�nariste, �crivaine et "
				+ "dramaturge fran�aise.\r\n"
				+ "\r\n"
				+ "Dans les ann�es 1980, elle encha�ne les seconds r�les, g�n�ralement comiques, o� elle joue de sa dyslalie. Mais en 1991, elle "
				+ "d�cide d'arr�ter sa carri�re d'actrice et de se consacrer � l'�criture, notamment de sc�narios. En 2005, elle �crit et r�alise "
				+ "son premier film, Je vous trouve tr�s beau, qui lui vaut un succ�s public et critique et un C�sar du meilleur premier film, puis "
				+ "r�alise deux autres films : Enfin veuve (2008) et Donnant donnant (2010).\r\n"
				+ "\r\n"
				+ "Apr�s avoir jou� dans plusieurs pi�ces de th��tre, dont deux de Laurent Ruquier, elle �crit ses propres pi�ces de com�die dans "
				+ "lesquelles elle joue �galement : L'Amour sur un plateau (2011), Adieu je reste ! (2012), Ouh Ouh (2014), Ne me regardez pas comme �a !"
				+ " (2015), La Raison d'Aym� (2018) et Elle & Lui (2020).\r\n"
				+ "\r\n"
				+ "En parall�le, elle participe en tant que chroniqueuse aux diff�rentes �missions radiophoniques et t�l�visuelles de Laurent Ruquier, "
				+ "notamment aux Grosses T�tes sur RTL.",
				"pointComedie/WebContent/vue/img/theatre/actrice1.jpg"));
		liste.add(new Artiste(
				"Spiteri",
				"Philippe",
				null,
				"pointComedie/WebContent/vue/img/theatre/acteur1.jpg"));
		liste.add(new Artiste(
				"Barcelona",
				"Jean-Louis",
				"Jean-Louis Barcelona est un acteur fran�ais. Il commence � faire du th��tre au Centre d'animation jeunesse d'Aussillon, dans le Tarn, "
				+ "puis passe un bac option th��tre et un dipl�me d'�tudes universitaires scientifiques et techniques, � Aix-en-Provence. Il int�gre "
				+ "ensuite le Conservatoire de Marseille et poursuit sa formation au Th��tre de Chaillot � Paris.",
				"pointComedie/WebContent/vue/img/theatre/acteur2.jpg"));
		return liste;
	}

	private static ArrayList<Representation> initRepresentations() {
		ArrayList<Representation> representations = new ArrayList<Representation>();
		
		LocalDateTime planning1 = LocalDateTime.of(2021, 4, 1, 19, 00);
		LocalDateTime planning2 = LocalDateTime.of(2021, 4, 2, 20, 0);
		LocalDateTime planning3 = LocalDateTime.of(2021, 4, 3, 20, 30);
		
		representations.add(new Representation(55, planning1, 10.0));
		representations.add(new Representation(47, planning2, 10.0));
		representations.add(new Representation(49, planning3, 10.0));
		
		return representations;
	}
	
}
