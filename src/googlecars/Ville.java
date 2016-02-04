package googlecars;

import java.util.ArrayList;

public class Ville {
	private int nbIntersections, nbRues, tempsAutorise, nbVehicules, posInitiale;
	private ArrayList<Rue> rues;
	private ArrayList<Voiture> voitures;
	private ArrayList<Intersection> intersections;
	
	
	public Ville (int nbi, int nbr, int tpsa, int nbv, int posi){
		nbIntersections = nbi;
		nbRues = nbr;
		tempsAutorise = tpsa;
		nbVehicules = nbv;
		posInitiale = posi;
		rues = new ArrayList<Rue>();
		voitures = new ArrayList<Voiture>();
<<<<<<< HEAD
		intersections = new ArrayList<Intersection>();
=======
<<<<<<< HEAD
=======
		intersections = new Intersection[nbIntersections];
>>>>>>> origin/master
		for(int i=0;i<nbVehicules;i++){
			voitures.add(new Voiture(tempsAutorise));
		}
	}
	
	public void ajouterIntersection(double la,double lo){
		
>>>>>>> b665d6e45815cc0819414b6f45f64fab6d32bd67
	}
	
	public void ajouterRue(boolean ds,Intersection d,Intersection a,int c, int l){
		
	}

	public int getNbIntersections() {
		return nbIntersections;
	}

	public void setNbIntersections(int nbIntersections) {
		this.nbIntersections = nbIntersections;
	}

	public int getNbRues() {
		return nbRues;
	}

	public void setNbRues(int nbRues) {
		this.nbRues = nbRues;
	}

	public int getTempsAutorise() {
		return tempsAutorise;
	}

	public void setTempsAutorise(int tempsAutorise) {
		this.tempsAutorise = tempsAutorise;
	}

	public int getNbVehicules() {
		return nbVehicules;
	}

	public void setNbVehicules(int nbVehicules) {
		this.nbVehicules = nbVehicules;
	}

	public int getPosInitiale() {
		return posInitiale;
	}

	public void setPosInitiale(int posInitiale) {
		this.posInitiale = posInitiale;
	}

	public ArrayList<Rue> getRues() {
		return rues;
	}

	public void setRues(ArrayList<Rue> rues) {
		this.rues = rues;
	}

	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}

	public ArrayList<Intersection> getIntersections() {
		return intersections;
	}

	public void setIntersections(ArrayList<Intersection> intersections) {
		this.intersections = intersections;
	}
}
