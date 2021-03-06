package googlecars;

public class Rue {
	private int doublesens;
	private Intersection depart;
	private Intersection arrive;
	private int cout;
	private int longueur;
	private boolean visite;
	
	public boolean isVisite() {
		return visite;
	}
	public void setVisite(boolean visite) {
		this.visite = visite;
	}
	public Rue(Intersection d,Intersection a,int ds,int c, int l){
		doublesens=ds;
		depart=d;
		arrive=a;
		cout=c;
		longueur=l;
		visite=false;
	}
	public int getDoublesens() {
		return doublesens;
	}
	public void setDoublesens(int doublesens) {
		this.doublesens = doublesens;
	}
	public Intersection getDepart() {
		return depart;
	}
	public void setDepart(Intersection depart) {
		this.depart = depart;
	}
	public Intersection getArrive() {
		return arrive;
	}
	public void setArrive(Intersection arrive) {
		this.arrive = arrive;
	}
	public int getCout() {
		return cout;
	}
	public void setCout(int cout) {
		this.cout = cout;
	}
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	

}
