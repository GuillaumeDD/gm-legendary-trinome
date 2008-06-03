import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nyho
 */

public class MorpionAfricainGraphique extends MorpionAfricain{
    
    FenetreMorpionAfricain fenetre;
	private int tour=0;
    

    
    public MorpionAfricainGraphique(){
        super();
		joueurCourant=new JoueurMorpionAfricainGraphique();
		joueurs[0]=new JoueurMorpionAfricainGraphique();
		joueurs[1]=new JoueurMorpionAfricainGraphique();
        damier=new DamierMorpionAfricainGraphique(this);
        fenetre=new FenetreMorpionAfricain((DamierMorpionAfricainGraphique)damier,joueurs);
        System.out.println("Test");
        
    }
    
    public void initialiser(int numCase){
		int i=0;
		int c=0;	
		while(i<6){
			do{
				fenetre.setTextInfos("A "+joueurCourant.getNom()+" de jouer");
				c=Integer.parseInt(entree.readLine());
			}while(!damier.getCase(c-1).getLibre());
			
			try{
				((JoueurMorpionAfricain)joueurCourant).initialiser(damier.getCase(c-1));
				changerJoueurCourant();
				i++;
			}catch(CaseInvalideException e){
				System.out.println("Case occupée ou inexistante !");
			}


		}
		// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
		System.out.println(damier);
		//!!!
    }
	
	public int getTour(){
		return tour;
	}
	
	public void setTour(int i){
		tour=i;
	}
 
}
