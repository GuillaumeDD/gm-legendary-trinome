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
		fenetre.setTextInfos("A "+joueurCourant.getJoueurSuivant().getNom()+" de jouer");
		// TEST POUR CASE LIBRE
		//while(!damier.getCase(c-1).getLibre());
		
		getDamier().getCase(numCase-1).setColor(joueurCourant.getId());
		
		//Enlever le try ??
		try{
			((JoueurMorpionAfricain)joueurCourant).initialiser(damier.getCase(numCase-1));
			changerJoueurCourant();
		}catch(CaseInvalideException e){System.out.println("Case occupée ou inexistante !");}
    }
    
    public void jouer(int numCase){
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
			}while(damier.getCase(o-1).getJoueur()!=(JoueurMorpionAfricain)joueurCourant || damier.getCase(d-1).getLibre());
			try{
				((JoueurMorpionAfricain)joueurCourant).jouer(damier.getCase(o-1),damier.getCase(d-1));
				changerJoueurCourant();
			}catch( CaseInvalideException e){
				System.out.println("La case est invalide !");
			}
				// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
			System.out.println(damier);
			//!!!
		}
		changerJoueurCourant();
		((JoueurMorpionAfricain)joueurCourant).setScore(((JoueurMorpionAfricain)joueurCourant).getScore()+1);
		System.out.println("Victoire du Joueur : "+ (joueurCourant.getId()+1));
		System.out.println("Scores : J1 - "+((JoueurMorpionAfricain)joueurs[0]).getScore()+" J2 - "+((JoueurMorpionAfricain)(joueurs[1].getJoueurSuivant())).getScore());
    }
	
	public int getTour(){
		return tour;
	}
	
	public void setTour(int i){
		tour=i;
	}
	
	public DamierMorpionAfricainGraphique getDamier(){
		return (DamierMorpionAfricainGraphique)damier;
	}
 
}
