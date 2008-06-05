package morpionAfricain;
import jeu.*;
import java.awt.*;

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
    boolean aChoisiLePion=false;
    boolean partieEnCours=true;
    
    public MorpionAfricainGraphique(){
        super();
		joueurCourant=new JoueurMorpionAfricainGraphique();
		joueurs[0]=new JoueurMorpionAfricainGraphique(0,new Color(255,255,0));
		joueurs[1]=new JoueurMorpionAfricainGraphique(1,new Color(102,255,0));
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
			verifierEtatDeLaPartie();
		}catch(CaseInvalideException e){fenetre.setTextInfos("Mauvaise case. "+joueurCourant+" rejoue !");}
    }
    
    public void jouer(int o, int d){
    	if(partieEnCours){

			try{
				getJoueurCourant().jouer(damier.getCase(o),damier.getCase(d));
				getDamier().getCase(o).setColor(-1);
				getDamier().getCase(d).setColor(joueurCourant.getId());	
				changerJoueurCourant();
				fenetre.setTextInfos("A "+joueurCourant+" de jouer");
			}catch( CaseInvalideException e){
				fenetre.setTextInfos("Mauvaise case. "+joueurCourant+" rejoue !");
			}
			verifierEtatDeLaPartie();
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
		setaChoisiLePion(false);
	}
	
	public boolean aChoisiLePion(){
		return aChoisiLePion;
	}
	
	public void setaChoisiLePion(boolean b){
		aChoisiLePion=b;
	}
	
	public void verifierEtatDeLaPartie(){
		if(fini()){
			changerJoueurCourant();
			getJoueurCourant().addScore();
			fenetre.setTextInfos("Victoire de : "+ joueurCourant);
			partieEnCours=false;
		}	
	}
    
    public void reinitialiser(){
    	super.reinitialiser();
    	for(int i=0;i<9;i++)
    		getDamier().getCase(i).setColor(-1);
    	partieEnCours=true;
    	setTour(0);
    }
}
