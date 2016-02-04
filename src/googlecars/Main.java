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
		try {
			FileInputStream fis = new FileInputStream(f);
			in = new Scanner(fis);
			//32300020 //3intersections,2rues,3000s,2véhicules,partantde0.
			int nbi, nbr, tpsa, nbv, posi;
			nbi=in.nextInt();
			nbr=in.nextInt();
			tpsa=in.nextInt();
			nbv=in.nextInt();
			posi=in.nextInt();
			
			ville =new Ville(nbi, nbr, tpsa, nbv, posi);
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return ville;
	}
}
