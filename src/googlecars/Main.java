package googlecars;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Intersection> blop= new ArrayList<Intersection>();
	
	
	public static void main(String args[]){
		Locale.setDefault(Locale.ENGLISH);

		Ville ville = loadData(new File("paris_54000.txt"));
		/*
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
				r.setVisite(true);
				depart=r.getArrive();
				v.setTempsRestant(v.getTempsRestant()-r.getCout());
				if(v.getTempsRestant()>0){
					v.setTrajet(v.getTrajet()+r.getLongueur());
					r.setLongueur(0);
				}
			}
			v.getChemin().remove();
		}*/
		
		System.out.println(ville.score());
	}
		
	
	public static Ville loadData(File f){
		Ville ville = null;
		int i;
		try {
			FileInputStream fis = new FileInputStream(f);
			in = new Scanner(fis);
			//32300020 //3intersections,2rues,3000s,2vehicules,partantde0.
			int nbi, nbr, tpsa, nbv, posi;
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
	
	public static Intersection BestRatio(Intersection I,int TempsUtilise,int DistTot,int Tempsmax){
	for (Rue r : I.getRues()){
		Intersection destination;
		if(I.equals(r.getArrive())){
			destination=r.getDepart();
		}
		else{
			destination=r.getArrive();
		}
			
		if (destination.getRatio()<(DistTot+r.getLongueur())/(TempsUtilise+r.getCout())){
			if (TempsUtilise+r.getCout()<Tempsmax){
				destination.setRatio((DistTot+r.getLongueur())/(TempsUtilise+r.getCout()));
				r.setLongueur(0);
				TempsUtilise+=r.getCout();
				DistTot+=r.getLongueur();
				blop.add(BestRatio(destination, TempsUtilise, DistTot,Tempsmax));
			}
		}
	}
	return I;
	}
}
