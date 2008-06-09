package morpionAfricain;
import java.io.*;

import jeu.*;

public class MorpionAfricainConsole extends MorpionAfricain{

	public MorpionAfricainConsole(){
		super();
	}

	public void initialiser(){
		int i=0;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Phase d'initialisation");
		int c=0;	
		while(i<6){
			do{
				try {
					System.out.println(joueurCourant);
					System.out.println("Entrer la case : ");
					c=Integer.parseInt(entree.readLine());
					
				} catch( IOException e ) {e.printStackTrace();}
			}while(!damier.getCase(c-1).getLibre());
			
			try{
				getJoueurCourant().initialiser(damier.getCase(c-1));
				changerJoueurCourant();
				i++;
			}catch(CaseInvalideException e){
				System.out.println("Case occupée ou inexistante !");
			}


		}
		System.out.println(damier);
	}
	
	public void jouer(){
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		int o,d;
		o=0;
		d=0;
		System.out.println("Phase de jeu");
		while(!fini()){
			//Tant que les case selectionnées ne sont pas valide (ie : o est au joueur et d est libre) on rerentre les valeurs
			do{
				System.out.println(joueurCourant);
				try {
					o=Integer.parseInt(entree.readLine());
					d=Integer.parseInt(entree.readLine());
				} catch( IOException e ) {e.printStackTrace();}
			}while(damier.getCase(o-1).getJoueur()!=getJoueurCourant() || !damier.getCase(d-1).getLibre());
			try{
				getJoueurCourant().jouer(damier.getCase(o-1),damier.getCase(d-1));
				changerJoueurCourant();
			}catch( CaseInvalideException e){
				System.out.println("La case est invalide !");
			}
			System.out.println(damier);
		}
		changerJoueurCourant();
		getJoueurCourant().addScore();
		System.out.println("Victoire du Joueur : "+ (joueurCourant.getId()+1));
		System.out.println("Scores : J1 - "+getJoueur(0).getScore()+" J2 - "+getJoueur(1).getScore());
	}
}
