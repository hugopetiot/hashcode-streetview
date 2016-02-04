package googlecars;

import java.util.LinkedList;

public class Voiture {
	private LinkedList<Intersection> chemin;
	private int tempsRestant;
	
	public void addIntersection(Intersection i){
		this.chemin.add(i);		
	}
	
	public Voiture(int temps){
		chemin = new LinkedList<Intersection>();
		this.tempsRestant=temps;
	}
	
}
