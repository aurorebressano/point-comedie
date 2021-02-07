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
				"Isabelle Mergault, née le 11 mai 1958 dans le 14e arrondissement de Paris, est une actrice, réalisatrice, scénariste, écrivaine et "
				+ "dramaturge française.\r\n"
				+ "\r\n"
				+ "Dans les années 1980, elle enchaîne les seconds rôles, généralement comiques, où elle joue de sa dyslalie. Mais en 1991, elle "
				+ "décide d'arrêter sa carrière d'actrice et de se consacrer à l'écriture, notamment de scénarios. En 2005, elle écrit et réalise "
				+ "son premier film, Je vous trouve très beau, qui lui vaut un succès public et critique et un César du meilleur premier film, puis "
				+ "réalise deux autres films : Enfin veuve (2008) et Donnant donnant (2010).\r\n"
				+ "\r\n"
				+ "Après avoir joué dans plusieurs pièces de théâtre, dont deux de Laurent Ruquier, elle écrit ses propres pièces de comédie dans "
				+ "lesquelles elle joue également : L'Amour sur un plateau (2011), Adieu je reste ! (2012), Ouh Ouh (2014), Ne me regardez pas comme ça !"
				+ " (2015), La Raison d'Aymé (2018) et Elle & Lui (2020).\r\n"
				+ "\r\n"
				+ "En parallèle, elle participe en tant que chroniqueuse aux différentes émissions radiophoniques et télévisuelles de Laurent Ruquier, "
				+ "notamment aux Grosses Têtes sur RTL.",
				"pointComedie/WebContent/vue/img/theatre/actrice1.jpg"));
		liste.add(new Artiste(
				"Spiteri",
				"Philippe",
				null,
				"pointComedie/WebContent/vue/img/theatre/acteur1.jpg"));
		liste.add(new Artiste(
				"Barcelona",
				"Jean-Louis",
				"Jean-Louis Barcelona est un acteur français. Il commence à faire du théâtre au Centre d'animation jeunesse d'Aussillon, dans le Tarn, "
				+ "puis passe un bac option théâtre et un diplôme d'études universitaires scientifiques et techniques, à Aix-en-Provence. Il intègre "
				+ "ensuite le Conservatoire de Marseille et poursuit sa formation au Théâtre de Chaillot à Paris.",
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
