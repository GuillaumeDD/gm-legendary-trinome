import java.io.*;
public class Morpion extends Jeu{
	private CaseMorpion cases[] = new CaseMorpion[9];
//on redefinit un joueurCourant de type JoueurMorpion car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	private Joueur joueurCourant; 
	
	public Morpion(){
		joueurCourant=new JoueurMorpion();
	}
	
	public void creerCases(){
		
	}
	public void creerJoueurs(){
		
	}
	public void initialiser(){
		/*
		int i;
		for(i=0;i<6;i++){
			joueurCourant.initialiser();
			changerJoueurCourant();
		}
		*/
	}
	public void jouer(){
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	
		CaseMorpion origine,destination;
		int o,d;
		origine=new CaseMorpion();
		destination=new CaseMorpion();
		

		while(!fini()){
			try {
		        o=Integer.parseInt(entree.readLine());
		        System.out.println("Vous avez tape :"+o);
			} catch( IOException e ) {
			        e.printStackTrace();
			}
			((JoueurMorpion)joueurCourant).jouer(origine,destination);
			changerJoueurCourant();
		}
	}
	public boolean fini(){
		return false;
	}
	public void changerJoueurCourant(){
		joueurCourant=joueurCourant.getJoueurSuivant();
	}
}
