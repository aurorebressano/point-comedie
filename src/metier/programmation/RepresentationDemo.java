package metier.programmation;

import java.time.LocalTime;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Time;

public class RepresentationDemo 
{
	private Integer id;
	private static Integer counter = 0;
	private String titre;
	private String image;
	private String resume;
	private String theme;
	private String metteurEnScene;
	private ArrayList <String> comediens;
	private Integer salle; 
	private String theatre; 
	private String ville;
	private String dateToConvert;
	private java.sql.Date date;
	public int heure; 
	public int minutes;
	private Integer duree;
	private Integer prix;
	private Integer nbplaces;
	
	public RepresentationDemo()
	{
		++counter;
	}
	
	public RepresentationDemo(String titre)
	{
		this();
		setId();
		setTitre(titre);
		setImage(image);
		setResume(resume);
		setTheme(theme);
		setMetteurEnScene(metteurEnScene);
		setComediens(comediens);
		setSalle(salle);
		setTheatre(theatre);
		setVille(ville);
		setDate(dateToConvert);
		setHeure(heure);
		setMinutes(minutes);
		setDuree(duree);
		setPrix(prix);
		setNbplaces(nbplaces);
		
	}

	public Integer getId() 
	{
		return id;
	}

	public void setId() 
	{
		this.id = counter;
	}

	public String getTitre() 
	{
		return titre;
	}

	public void setTitre(String titre) 
	{
		this.titre = titre;
	}

	public String getImage() 
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}

	public String getResume() 
	{
		return resume;
	}

	public void setResume(String resume) 
	{
		this.resume = resume;
	}

	public String getTheme() 
	{
		return theme;
	}

	public void setTheme(String theme) 
	{
		this.theme = theme;
	}

	public String getMetteurEnScene()
	{
		return metteurEnScene;
	}

	public void setMetteurEnScene(String metteurEnScene) 
	{
		this.metteurEnScene = metteurEnScene;
	}

	public ArrayList<String> getComediens() 
	{
		return comediens;
	}

	public void setComediens(ArrayList<String> comédiens) 
	{
		this.comediens = comediens;
	}

	public Integer getSalle() 
	{
		return salle;
	}

	public void setSalle(Integer salle) 
	{
		this.salle = salle;
	}

	public String getTheatre() 
	{
		return theatre;
	}

	public void setTheatre(String theatre) 
	{
		this.theatre = theatre;
	}

	public String getVille() 
	{
		return ville;
	}

	public void setVille(String ville) 
	{
		this.ville = ville;
	}

	public Date getDate() 
	{
		return date;
	}

	public void setDate(String sdate) 
	{
		java.sql.Date javaSqlDate = java.sql.Date.valueOf(sdate);
		
		this.date = javaSqlDate;
	}

	
	public int getHeure() 
	{
		return heure;
	}

	public void setHeure(int heure) 
	{
		this.heure = heure;
	}
	
	public int getMinutes() 
	{
		return minutes;
	}

	public void setMinutes(int minutes) 
	{
		this.minutes = minutes;
	}

	public Integer getDuree() 
	{
		return duree;
	}

	public void setDuree(Integer duree) 
	{
		duree = duree;
	}

	public Integer getPrix() 
	{
		return prix;
	}

	public void setPrix(Integer prix) 
	{
		this.prix = prix;
	}

	public Integer getNbplaces() 
	{
		return nbplaces;
	}

	public void setNbplaces(Integer nbplaces) 
	{
		this.nbplaces = nbplaces;
	}

	@Override
	public String toString() {
		return "RepresentationDemo [id=" + id + ", titre=" + titre + ", image=" + image + ", resume=" + resume
				+ ", theme=" + theme + ", metteurEnScene=" + metteurEnScene + ", comédiens=" + comediens + ", salle="
				+ salle + ", theatre=" + theatre + ", ville=" + ville + ", date=" + date + ", heure=" + heure
				+ ", Duree=" + duree + ", prix=" + prix + ", nbplaces=" + nbplaces + "]";
	}

	

}
