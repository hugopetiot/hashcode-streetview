package googlecars;

import java.util.ArrayList;

public class Intersection {
	private ArrayList<Rue> rues;
	private double latitude;
	private double longitude;
	public Intersection(double la,double lo){
		latitude=la;
		longitude=lo;
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
	

}
