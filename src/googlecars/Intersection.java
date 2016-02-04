package googlecars;

import java.util.ArrayList;

public class Intersection {
	private ArrayList<Rue> rues;
	private ArrayList<Intersection> precedent;
	private double ratio;
	public ArrayList<Intersection> getPrecedent() {
		return precedent;
	}
	public void setPrecedent(ArrayList<Intersection> precedent) {
		this.precedent = precedent;
	}

	private double latitude;
	private double longitude;
	public Intersection(double la,double lo){
		latitude=la;
		longitude=lo;
		ratio=0;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	public ArrayList<Rue> getRues() {
		return rues;
	}
	public void setRues(ArrayList<Rue> rues) {
		this.rues = rues;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public Rue meilleure_rue()throws ProblemeMeilleureRueException{
		Rue ret=null;
		int tmp=-1;
		int max=-1;
		for (Rue r: rues){
			if(r.isVisite())
				tmp=0;
			else
				tmp=r.getLongueur()/r.getCout();
			if(tmp>max){
				max=tmp;
				ret=r;
			}
		}
		if(ret==null)
			throw new ProblemeMeilleureRueException();
		return ret;
	}

}
