package googlecars;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	
	public static void main(String args[]){

		Ville ville = loadData(new File("paris_54000.txt"));
		Intersection depart=ville.getIntersections().get(0);
		for(Voiture v: ville.getVoitures() ){
			Rue r=null;
			while(v.getTempsRestant()>0){
				try{
				r= depart.meilleure_rue();
				}
				catch(ProblemeMeilleureRueException e)
				{System.out.println("Wesh ca marche pas");
				return;}
				v.getChemin().add(r.getArrive());
				depart=r.getArrive();
				v.setTempsRestant(v.getTempsRestant()-r.getCout());
				if(v.getTempsRestant()>0)
					v.setTrajet(v.getTrajet()+r.getLongueur());
			}
			v.getChemin().remove();
		}
		
	}
		
	
	public static Ville loadData(File f){
		Ville ville = null;
		int i;
		try {
			FileInputStream fis = new FileInputStream(f);
			in = new Scanner(fis);
			//32300020 //3intersections,2rues,3000s,2véhicules,partantde0.
			int nbi, nbr, tpsa, nbv, posi;
			boolean bs;
			nbi=in.nextInt();
			nbr=in.nextInt();
			tpsa=in.nextInt();
			nbv=in.nextInt();
			posi=in.nextInt();
			
			ville =new Ville(nbi, nbr, tpsa, nbv, posi);
			
			for(i=0; i<nbi; i++ )
				ville.ajouterIntersection(in.nextDouble(), in.nextDouble());

			for(i=0; i<nbr; i++ ){
				ville.ajouterRue(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return ville;
	}
}
