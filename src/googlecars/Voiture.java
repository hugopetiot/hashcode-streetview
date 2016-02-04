package googlecars;

import java.util.LinkedList;

public class Voiture {
	private LinkedList<Intersection> chemin;
	private int tempsRestant;
	private int trajet;
	
	public void addIntersection(Intersection i){
		this.chemin.add(i);		
	}
	
	public Voiture(int temps){
		chemin = new LinkedList<Intersection>();
		this.tempsRestant=temps;
		trajet=0;
	}

	public LinkedList<Intersection> getChemin() {
		return chemin;
	}

	public void setChemin(LinkedList<Intersection> chemin) {
		this.chemin = chemin;
	}

	public int getTempsRestant() {
		return tempsRestant;
	}

	public void setTempsRestant(int tempsRestant) {
		this.tempsRestant = tempsRestant;
	}

	public int getTrajet() {
		return trajet;
	}

	public void setTrajet(int trajet) {
		this.trajet = trajet;
	}
	
}
