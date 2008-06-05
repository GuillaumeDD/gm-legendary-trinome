package morpion;
import jeu.*;
import java.awt.*;

public class MorpionGraphique extends Morpion{
    
    FenetreMorpion fenetre;
	private int tour=0;
	int tamponNumCase=-1;
    boolean aChoisiLePion=false;
    boolean partieEnCours=true;
    
    public MorpionGraphique(){
        super();
		joueurCourant=new JoueurMorpionGraphique();
		joueurs[0]=new JoueurMorpionGraphique(0,new Color(255,255,0));
		joueurs[1]=new JoueurMorpionGraphique(1,new Color(102,255,0));
        initialiserJoueurs();
        damier=new DamierMorpionGraphique(this);
        fenetre=new FenetreMorpion(this);
    }
         
    public void jouer(int caseId){
    	if(partieEnCours){
			try{
				getJoueurCourant().jouer(damier.getCase(caseId));
				changerJoueurCourant();
				fenetre.setTextInfos("A "+joueurCourant+" de jouer");
			}catch(CaseInvalideException e){
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
	
	public DamierMorpionGraphique getDamier(){
		return (DamierMorpionGraphique)damier;
	}
	
	public JoueurMorpionGraphique getJoueurCourant(){
		return (JoueurMorpionGraphique)joueurCourant;
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
    
    public void reset(){
		getJoueur(0).reset();
		getJoueur(1).reset();
    	getDamier().reset();
    	aChoisiLePion=false;
    	partieEnCours=true;
    	setTour(0);
    	nouvellePartie();
    }
    
    public void setTamponNumCase(int caseId){
    	tamponNumCase=caseId;
    }
    
    public int getTamponNumCase(){
    	return tamponNumCase;
    }
    
    public JoueurMorpionGraphique getJoueur(int id){
    	return (JoueurMorpionGraphique)joueurs[id];
    }
}
