package dao;

import java.time.LocalDateTime;
import java.util.ArrayList;

import metier.programmation.Artiste;
import metier.programmation.Representation;
import metier.programmation.Representations;
import metier.programmation.Salle;
import metier.programmation.Spectacle;
import metier.programmation.Theatre;

public class Dao {

	private static ArrayList<Artiste> artistes = initArtistes();
	private static ArrayList<Representation> representations = initRepresentations();
	private static ArrayList<Theatre> theatres = initTheatres();
	private static ArrayList<Salle> salles = initSalles();
	private static ArrayList<Spectacle> spectacles = initSpectacles();
	
	private static ArrayList<Artiste> initArtistes() {
		ArrayList<Artiste> liste = new ArrayList<Artiste>();
		liste.add(new Artiste(
				1,
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
				"/vue/img/theatre/actrice1.jpg"));
		liste.add(new Artiste(
				2,
				"Spiteri",
				"Philippe",
				null,
				"/vue/img/theatre/acteur1.jpg"));
		liste.add(new Artiste(
				3,
				"Barcelona",
				"Jean-Louis",
				"Jean-Louis Barcelona est un acteur français. Il commence à faire du théâtre au Centre d'animation jeunesse d'Aussillon, dans le Tarn, "
				+ "puis passe un bac option théâtre et un diplôme d'études universitaires scientifiques et techniques, à Aix-en-Provence. Il intègre "
				+ "ensuite le Conservatoire de Marseille et poursuit sa formation au Théâtre de Chaillot à Paris.",
				"/vue/img/theatre/acteur2.jpg"));
		return liste;
	}

	private static ArrayList<Spectacle> initSpectacles() {
		ArrayList<Spectacle> liste = new ArrayList<Spectacle>();
		ArrayList<Artiste> artistes = new ArrayList<Artiste>();
		artistes.add(Dao.getArtistes().get(0));
		artistes.add(Dao.getArtistes().get(1));
		artistes.add(Dao.getArtistes().get(2));
		
		Representations representations = new Representations();
		representations.add(Dao.getRepresentations().get(0));
		representations.add(Dao.getRepresentations().get(1));
		representations.add(Dao.getRepresentations().get(2));
		
		liste.add(new Spectacle(
				1, 
				"A la recherche du temps perdu",
				"Quand Virgil Tanasse s'intéresse à  Marcel Proust, cela donne un spectacle d'une beauté et d'une élégance rares. "
				+ "« A la recherche du temps perdu » est une rêverie poétique et mélancolique sur le temps, les souvenirs et l'art.\r\n"
				+ "\r\n"
				+ "Le passage sur la Madeleine est un moment d'une beauté époustouflante, mais la magie opère, particulièrement, "
				+ "quand le thème de la création artistique est abordé.\r\n"
				+ "\r\n"
				+ "Le lien se resserre, alors entre l’œuvre magistrale de Proust et cet objet théâtral. Théâtre littéraire, promenade"
				+ "de la pensée, parcours poétique, ce seul en scène est totalement inclassable et le poser, le temps d’un instant au "
				+ "Théâtre de la Contrescarpe, dans le quartier de La Sorbonne, est une très bonne idée. Tout de blanc vêtu, le "
				+ "comédien David Legrad nous fait une démonstration malicieuse de la pensée avec un texte dense et difficile et un "
				+ "travail sur le rythme, remarquable.\r\n"
				+ "\r\n"
				+ "Que ce soit par son corps ou sa voix, les ruptures sont très belles. Parfois très immobile ou se déplaçant comme "
				+ "un chat, il nuance subtilement le ton et passe par un phrasé très posé à des envolés beaucoup plus aériennes.\r\n"
				+ "\r\n"
				+ "« À la recherche du temps perdu » est une pièce tout en élégance et sensualité qui s’écoute autant qu’elle se voit."
				+ " La beauté des mots associée à la mise en scène et la scénographie donne une sensation très particulière proche du "
				+ "rêve éveillé.",
				"Jeunesse",
				55,
				"/vue/img/theatre/nathan-dumlao-LPRrEJU2GbQ-unsplash.jpg",
				artistes,
				representations));
		
		return liste;
	}

	private static ArrayList<Representation> initRepresentations() {
		ArrayList<Representation> representations = new ArrayList<Representation>();
		
		LocalDateTime planning1 = LocalDateTime.of(2021, 4, 1, 19, 00);
		LocalDateTime planning2 = LocalDateTime.of(2021, 4, 2, 20, 0);
		LocalDateTime planning3 = LocalDateTime.of(2021, 4, 3, 20, 30);
		
		representations.add(new Representation(1, 55, planning1, 10.0));
		representations.add(new Representation(2, 47, planning2, 10.0));
		representations.add(new Representation(3, 49, planning3, 10.0));
		
		return representations;
	}
	
	private static ArrayList<Theatre> initTheatres() {
		ArrayList<Theatre> theatres = new ArrayList<Theatre>();
		theatres.add(new Theatre(
		1, 
		"Tandem Scène nationale", 
		"Le TANDEM Scène nationale privilégie le croisement des arts et la découverte des courants artistiques incontournables de la"
		+ " scène européenne et internationale (60 propositions pour 150 représentations par saison) et mène un programme ambitieux "
		+ "d’actions culturelles.",
		"7 place du theatre, 62 000 Arras",
		"/vue/img/theatre/arras_theatre_1500x1000_px_01-400x350.jpg"));
		
		return theatres;
	}
	
	private static ArrayList<Salle> initSalles() {
		ArrayList<Salle> salles = new ArrayList<Salle>();
		
		salles.add(new Salle(1, "Malraux", 500, Dao.getTheatres().get(0)));
		salles.add(new Salle(2, "Obey", 140, Dao.getTheatres().get(0)));
		salles.add(new Salle(3, "Paul Desmarets", 90, Dao.getTheatres().get(0)));
		salles.add(new Salle(4, "Reybaz", 80, Dao.getTheatres().get(0)));
		salles.add(new Salle(5, "Salle à l'italienne", 250, Dao.getTheatres().get(0)));
		salles.add(new Salle(6, "Salle des concerts", 400, Dao.getTheatres().get(0)));
		return salles;
	}
	
	public static ArrayList<Salle> getSallesByTheatre(Theatre theatre) {
		ArrayList<Salle> salles = new ArrayList<Salle>();
		
		for (Salle salle : Dao.salles) {
			if (salle.getTheatre().getId() == theatre.getId()) {
				salles.add(salle);
			}
		}
		
		return salles;
	}
	
	// getters
	public static ArrayList<Representation> getRepresentations() {
		return Dao.representations;
	}
	
	public static ArrayList<Artiste> getArtistes() {
		return Dao.artistes;
	}
	
	public static ArrayList<Theatre> getTheatres() {
		return Dao.theatres;
	}
	
	public static ArrayList<Salle> getSalles() {
		return Dao.salles;
	}

	public static ArrayList<Spectacle> getSpectacles() {
		return spectacles;
	}
	
}
