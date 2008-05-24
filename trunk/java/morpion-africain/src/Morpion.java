import java.io.*;
public class Morpion extends Jeu{
	//private CaseMorpion cases[] = new CaseMorpion[9];
	private damierMorpion damier;
//on redefinit un joueurCourant de type JoueurMorpion car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	private Joueur joueurCourant; 
	
	public Morpion(){
		// on ajoute les deux joueurs
		super(2);
		joueurCourant=new JoueurMorpion();
		joueurs[0]=new JoueurMorpion();
		joueurs[1]=new JoueurMorpion();
		
		joueurs[0].setId(0);
		joueurs[1].setId(1);
		
		joueurs[0].setJoueurPrecedent(joueurs[1]);
		joueurs[0].setJoueurSuivant(joueurs[1]);
		joueurs[1].setJoueurPrecedent(joueurs[0]);
		joueurs[1].setJoueurSuivant(joueurs[0]);
		
		// On determine le premier joueur
		joueurCourant=joueurs[0];
		
		damier=new damierMorpion();
		
	}

	public void initialiser(){
		int i;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));


		int c=0;	
		for(i=0;i<6;i++){
			try {
		        c=Integer.parseInt(entree.readLine());
			} catch( IOException e ) {e.printStackTrace();}
			((JoueurMorpion)joueurCourant).initialiser(damier.getCase(c-1));
			changerJoueurCourant();


		}
		// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
		System.out.println(damier);
		//!!!
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
			} catch( IOException e ) {e.printStackTrace();}
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

	public JoueurMorpion getJoueur(int id){
		return (JoueurMorpion)joueurs[id];
	}
}
