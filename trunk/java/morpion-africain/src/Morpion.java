import java.io.*;
public class Morpion extends Jeu{
	private CaseMorpion cases[] = new CaseMorpion[9];
//on redefinit un joueurCourant de type JoueurMorpion car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	private Joueur joueurCourant; 
	
	public Morpion(){
		super(2);
		joueurCourant=new JoueurMorpion();
		joueurs[0]=new JoueurMorpion();
		joueurs[1]=new JoueurMorpion();
		joueurCourant=((JoueurMorpion)joueurs[0]);
		for(int i=0;i<9;i++){
			cases[i]=new CaseMorpion();
			cases[i].setLibre(true,null);
		}
	}

	public void initialiser(){
		int i;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));


		int c=0;	
		for(i=0;i<6;i++){
			try {
		        c=Integer.parseInt(entree.readLine());
			} catch( IOException e ) {e.printStackTrace();}
			((JoueurMorpion)joueurCourant).initialiser(cases[c-1]);
			changerJoueurCourant();

// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
			char contenuCase;
				
			for(int j=0;j<9;j++){
				contenuCase='-';
				if(cases[j].getJoueur()==joueurs[0])
					contenuCase='x';
				else if(cases[j].getJoueur()==joueurs[1])
					contenuCase='o';
				System.out.print(contenuCase);
				if(j%3==2)
					System.out.println();
			}		
// !!!
		}
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
		joueurCourant=((JoueurMorpion)joueurCourant.getJoueurSuivant());
	}
}
