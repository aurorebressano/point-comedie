package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;

import metier.programmation.RepresentationDemo;


public class DemoArray implements Comparator<RepresentationDemo>
{
	public static ArrayList <RepresentationDemo> repres = listeRepres();
	public static ArrayList <RepresentationDemo> represSessionTempId = new ArrayList<RepresentationDemo>();
	
	public static ArrayList <RepresentationDemo> listeRepres()
	{
		repres = new ArrayList();
		
		//INITIALISER
		
		//Goodnight Fouilly-les-oies
		
		RepresentationDemo fouilly = new RepresentationDemo();
		ArrayList <String> comediens1 = new ArrayList();
		comediens1.add("Omar Sy");
		comediens1.add("Fred Testot");
		
		fouilly.setId();
		fouilly.setTitre("Goodnight Fouilly-les-oies");
		fouilly.setImage("/vue/img/theatre/retouches/sammoqadam.jpg");
		fouilly.setResume("La nuit, Fouilly-les-oies se révèle un hameau dangereux, grangrené par la mafia et la prostitution. Fred Testot et Omar Sy incarnent Bébert et Maurice, deux trafiquants de drogue.");
		fouilly.setTheme("tragédie");
		fouilly.setMetteurEnScene("Djamel Debbouze");
		fouilly.setComediens(comediens1);
		fouilly.setSalle(9);
		fouilly.setTheatre("Montparnasse");
		fouilly.setVille("Paris");
		fouilly.setDate("2021-04-15");
		fouilly.setHeure(20);
		fouilly.setMinutes(00);
		fouilly.setDuree(190);
		fouilly.setPrix(40);
		fouilly.setNbplaces(70);
		
		//Monologues de la fraise
		
		RepresentationDemo fraise = new RepresentationDemo();
		ArrayList <String> comediens2 = new ArrayList();
		comediens2.add("Nabilla Benatia");
		
		fraise.setId();
		fraise.setTitre("Les monologues de la fraise");
		fraise.setImage("/vue/img/theatre/retouches/stevenlasry.jpg");
		fraise.setResume("Nabilla incarne une fraise et nous explique comme il est difficile de vivre lorsqu’on est rouge et couvert de boutons. Saisissant.");
		fraise.setTheme("drame");
		fraise.setMetteurEnScene("Moundir");
		fraise.setComediens(comediens2);
		fraise.setSalle(8);
		fraise.setTheatre("Odéon");
		fraise.setVille("Paris");
		fraise.setDate("2021-04-04");
		fraise.setHeure(18);
		fraise.setMinutes(00);
		fraise.setDuree(60);
		fraise.setPrix(40);
		fraise.setNbplaces(80);
		
		//Le retour de Zorro
		
		RepresentationDemo zorro = new RepresentationDemo();
		ArrayList <String> comediens3 = new ArrayList();
		comediens3.add("Christina Cordula");
		comediens3.add("Jul");
		
		zorro.setId();
		zorro.setTitre("Le retour de Zorro");
		zorro.setImage("/vue/img/theatre/retouches/albertobigoni.jpg");
		zorro.setResume("Jul interprètera Zorro dans ce grand spectacle moderne et glorieux.\r\n"
				+ "Les fans du célèbre rappeur se réjouiront des petites répliques que glisse leur idole entre deux tirades en guise de clin d’oeil. “Wesh alors Tornado!” “A croire qu’tu vis à Miami gros Bernardo!” ponctueront l’intrigue.");
		zorro.setTheme("aventure");
		zorro.setMetteurEnScene("Bande Organisée");
		zorro.setComediens(comediens3);
		zorro.setSalle(2);
		zorro.setTheatre("La Criée");
		zorro.setVille("Marseille");
		zorro.setDate("2021-04-04");
		zorro.setHeure(18);
		zorro.setMinutes(00);
		zorro.setDuree(70);
		zorro.setPrix(22);
		zorro.setNbplaces(50);
		
		//Mais où est-donc Ornicar?
		
		RepresentationDemo ornicar = new RepresentationDemo();
		ArrayList <String> comediens4 = new ArrayList();
		comediens4.add("Nabilla Benatia");
		
		ornicar.setId();
		ornicar.setTitre("Mais où est-donc Ornicar?");
		ornicar.setImage("/vue/img/theatre/retouches/mostafameraji3.jpg");
		ornicar.setResume("Ornicar est une jeune fille de 16 ans, qui un matin, disparaît.");
		ornicar.setTheme("tragédie");
		ornicar.setMetteurEnScene("Maiwenn");
		ornicar.setComediens(comediens4);
		ornicar.setSalle(11);
		ornicar.setTheatre("Bidul’theatre");
		ornicar.setVille("Lyon");
		ornicar.setDate("2021-05-30");
		ornicar.setHeure(19);
		ornicar.setMinutes(00);
		ornicar.setDuree(45);
		ornicar.setPrix(15);
		ornicar.setNbplaces(35);
		
		//INSERER
		
		repres.add(fouilly);
		repres.add(fraise);
		repres.add(zorro);
		repres.add(ornicar);
		
		return repres;
	}
	
	
	/*public static ArrayList <RepresentationDemo> trierPagePanier()
	{
		represSessionTempId = new ArrayList<RepresentationDemo>();
		
		Set idSortedList = new HashSet();         
		idSortedList.addAll(represSessionTempId);
		ArrayList <RepresentationDemo> distinctIdList = new ArrayList<RepresentationDemo>(idSortedList);
		return distinctIdList; 
	}*/
	
	public static ArrayList <RepresentationDemo> trierDoublons(ArrayList <RepresentationDemo> represATrier)
	{
		Collection <RepresentationDemo> represSessionTriee = represSessionTempId;
		
		ArrayList <RepresentationDemo> distinctElements = (ArrayList<RepresentationDemo>) represSessionTriee.stream()
                .distinct()
                .collect(Collectors.toList());

		//Let's verify distinct elements
		System.out.println(distinctElements);
		return distinctElements; 
	}
	
	
	public static void VisualiserResultats()
	{
		//VISUALISER RESULTATS
		System.out.println(repres);
	}


	@Override
	public int compare(RepresentationDemo o1, RepresentationDemo o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
