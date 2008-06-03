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
	int tamponNumCase=-1;
    

    
    public MorpionAfricainGraphique(){
        super();
		joueurCourant=new JoueurMorpionAfricainGraphique();
		joueurs[0]=new JoueurMorpionAfricainGraphique(0);
		joueurs[1]=new JoueurMorpionAfricainGraphique(1);
        initialiserJoueurs();
        damier=new DamierMorpionAfricainGraphique(this);
        fenetre=new FenetreMorpionAfricain((DamierMorpionAfricainGraphique)damier,joueurs);
    }
    
    public void initialiser(int numCase){
		try{
			getJoueurCourant().initialiser(damier.getCase(numCase));
			//Changement de la couleur
			getDamier().getCase(numCase).setColor(joueurCourant.getId());
			changerJoueurCourant();
			fenetre.setTextInfos("A "+joueurCourant+" de jouer");
		}catch(CaseInvalideException e){fenetre.setTextInfos("Mauvaise case. "+joueurCourant+" rejoue !");}
    }
    
    public void jouer(int o, int d){
		try{
			getJoueurCourant().jouer(damier.getCase(o),damier.getCase(d));
			changerJoueurCourant();
			getDamier().getCase(o).setColor(-1);
			getDamier().getCase(d).setColor(joueurCourant.getId());	
			fenetre.setTextInfos("A "+joueurCourant+" de jouer");
		}catch( CaseInvalideException e){fenetre.setTextInfos("Mauvaise case. "+joueurCourant+" rejoue !");}
		
		if(fini()){
			changerJoueurCourant();
			getJoueurCourant().addScore();
			fenetre.setTextInfos("Victoire de : "+ joueurCourant);
		}
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
	
	public JoueurMorpionAfricainGraphique getJoueurCourant(){
		return (JoueurMorpionAfricainGraphique)joueurCourant;
	}
		
	public void changerJoueurCourant(){
		super.changerJoueurCourant();
		setTour(getTour()+1);
	}
}
