package morpion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jeu.CaseInvalideException;

public class MorpionConsole extends Morpion{
	
	public MorpionConsole(){
		super();
	}
	
    
	public void jouer(){
		int i=0;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

		joueurVainqueur=null;
		int c=0;	
		while(!fini()){
			System.out.println(damier);
			do{
				try {
					System.out.println("Joueur "+joueurCourant.getId());
					System.out.println("Entrer la case : ");
					c=Integer.parseInt(entree.readLine());
					
				} catch( IOException e ) {e.printStackTrace();}
			}while(!damier.getCase(c-1).getLibre());
			try{
				getJoueurCourant().jouer(damier.getCase(c-1));
				changerJoueurCourant();
				i++;
			}catch(CaseInvalideException e){
				System.out.println("Case occupée ou inexistante !");
			}
		}
		
		if(joueurVainqueur==null)
			System.out.println("Pas de vainqueur");
		else
			System.out.println("Joueur "+joueurVainqueur.getId()+" est vainqueur");
		
		System.out.println(damier);
	}


}
