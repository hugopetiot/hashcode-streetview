package googlecars;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	
	public static void main(String args[]){
		Ville ville = loadData(new File("paris_54000.txt"));
		for(Voiture v: ville.getVoitures() ){
			
		}
		
	}
	
	public static Ville loadData(File f){
		Ville ville = null;
		int rangees, emplacements, emplacementsIndisponibles, groupes, serveurs;
		int i;
		try {
			FileInputStream fis = new FileInputStream(f);
			in = new Scanner(fis);
			//2rangeesde5emplacements,1emplacementindisponible,2groupeset5serveurs.
			rangees = in.nextInt();
			emplacements= in.nextInt(); 
			emplacementsIndisponibles= in.nextInt(); 
			groupes= in.nextInt(); 
			serveurs= in.nextInt();
			System.out.println(rangees+"  "+emplacements);
			datac = new Datacenter(rangees, emplacements, emplacementsIndisponibles, groupes, serveurs);
			
			for(  i = 0 ; i<emplacementsIndisponibles; i++)
				datac.ajoutIndisponible(in.nextInt(), in.nextInt());
			
			for( i = 0 ; i<serveurs; i++)
				datac.ajoutListeServeur(in.nextInt(), in.nextInt());
			
			datac.etat();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datac;
	}
}
