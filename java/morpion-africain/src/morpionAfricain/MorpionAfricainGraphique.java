package morpionAfricain;
import jeu.*;
import java.awt.*;

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
        fenetre=new FenetreMorpionAfricain(this);
    }
    
    public void boutonActionne(int caseId){
    	if(getTour()<6){
			initialiser(caseId);
		}else{ 
			if(!aChoisiLePion()){
				//si le joueur n'a pas choisi de pion
    			if(getJoueurCourant().estUneCaseOccupee(damier.getCase(caseId))){
    				//si cette case contient un pion du joueur
    				setTamponNumCase(caseId);
    				setaChoisiLePion(true);//alors il a choisi son pion
    			}else{
    				//dans le cas contraire il n'a pas choisi son pion
    				setaChoisiLePion(false);
    			}
    		}else{
    			//si le joueur a choisi son pion, on joue
    			jouer(getTamponNumCase(),caseId);
    			// on met le choix du pion à false dans le cas où le pion est "bloqué"
    			setaChoisiLePion(false);
    			//il n'y aura pas d'appel à changerJoueurCourant qui remettra à false
    		}
		}
    }
    
    public void initialiser(int numCase){
		try{
			getJoueurCourant().initialiser(damier.getCase(numCase));
			changerJoueurCourant();
			fenetre.setTextInfos("A "+joueurCourant+" de jouer");
			verifierEtatDeLaPartie();
		}catch(CaseInvalideException e){fenetre.setTextInfos("Mauvaise case. "+joueurCourant+" rejoue !");}
    }
    
    public void jouer(int o, int d){
    	if(partieEnCours){

			try{
				getJoueurCourant().jouer(damier.getCase(o),damier.getCase(d));
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
    
    public JoueurMorpionAfricainGraphique getJoueur(int id){
    	return (JoueurMorpionAfricainGraphique)joueurs[id];
    }
}
