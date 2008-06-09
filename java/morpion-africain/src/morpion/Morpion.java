package morpion;
import jeu.*;
import java.util.ArrayList;
import java.util.List;
public class Morpion extends Jeu{
	DamierMorpion damier;
	int partie=0;
//on redefinit un joueurCourant de type JoueurMorpionAfricain car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	Joueur joueurCourant,joueurVainqueur,joueurTest;
	ArrayList<ArrayList<Integer>> solutions;
	
	public Morpion(){
		// on ajoute les deux joueurs
		super(2);
		joueurCourant=new JoueurMorpion();
		joueurs[0]=new JoueurMorpion(0);
		joueurs[1]=new JoueurMorpion(1);
		joueurVainqueur= new JoueurMorpion();
		joueurTest = new JoueurMorpion();
        initialiserJoueurs();
		
		damier=new DamierMorpion();
		//Initialisation des solutions
		solutions = new ArrayList<ArrayList<Integer>>();
		solutions.add(new ArrayList<Integer>());
		solutions.get(0).add(0);
		solutions.get(0).add(1);
		solutions.get(0).add(2);
		solutions.add(new ArrayList<Integer>());
		solutions.get(1).add(3);
		solutions.get(1).add(4);
		solutions.get(1).add(5);
		solutions.add(new ArrayList<Integer>());
		solutions.get(2).add(6);
		solutions.get(2).add(7);
		solutions.get(2).add(8);
		solutions.add(new ArrayList<Integer>());
		solutions.get(3).add(0);
		solutions.get(3).add(3);
		solutions.get(3).add(6);
		solutions.add(new ArrayList<Integer>());
		solutions.get(4).add(1);
		solutions.get(4).add(4);
		solutions.get(4).add(7);
		solutions.add(new ArrayList<Integer>());
		solutions.get(5).add(2);
		solutions.get(5).add(5);
		solutions.get(5).add(8);
		solutions.add(new ArrayList<Integer>());
		solutions.get(6).add(0);
		solutions.get(6).add(4);
		solutions.get(6).add(8);
		solutions.add(new ArrayList<Integer>());
		solutions.get(7).add(2);
		solutions.get(7).add(4);
		solutions.get(7).add(6);
		
	}
        
    public void initialiserJoueurs(){
			
		joueurs[0].setJoueurPrecedent(joueurs[1]);
		joueurs[0].setJoueurSuivant(joueurs[1]);
		joueurs[1].setJoueurPrecedent(joueurs[0]);
		joueurs[1].setJoueurSuivant(joueurs[0]);
		
	                
	    // On determine le premier joueur
		joueurCourant=joueurs[0];
    }
	
	public void reset(){
		damier.reset();
		getJoueur(0).reset();
		getJoueur(1).reset();
		nouvellePartie();
	}	
	
	public boolean fini(){
		boolean res=false;
		int i,taille;
		
		//Le test porte sur le joueur qui vient de poser un pion
		joueurTest=joueurCourant.getJoueurPrecedent();
		taille=getJoueurTest().getCasesOccupees().size();
		
		//Si le joueur testé a posé 3 pions ou plus
		if(taille>=3){
			List<Integer> casesJoueurTest = new ArrayList<Integer>();
			
			for(i=0;i<taille;i++)
				casesJoueurTest.add(getJoueurTest().getCasesOccupees(i));
			
			i=0;
			do{
				if(
					 casesJoueurTest.contains(solutions.get(i).get(0)) 
				  && casesJoueurTest.contains(solutions.get(i).get(1)) 
				  && casesJoueurTest.contains(solutions.get(i).get(2))
				){
					res=true;
					joueurVainqueur=joueurTest;
				}
				i++;
			}while(!res && i<8);
		}
		//Si 9 pions ont été joués et que personne n'a gagné, personne n'a gagné ^^
		if(getJoueur(0).getCasesOccupees().size()+getJoueur(1).getCasesOccupees().size()==9 && !res){
			res=true;
			joueurVainqueur=null;
		}
		return res;
	}
	
	public void changerJoueurCourant(){
		joueurCourant=joueurCourant.getJoueurSuivant();
	}

	public JoueurMorpion getJoueur(int id){
		return (JoueurMorpion)joueurs[id];
	}
	
	public JoueurMorpion getJoueurCourant(){
		return (JoueurMorpion)joueurCourant;
	}
	
	public JoueurMorpion getJoueurTest(){
		return (JoueurMorpion)joueurTest;
	}
	
    public void nouvellePartie(){
    	partie++;
    	if(partie%2!=0){
    		joueurCourant=getJoueur(1);
    	}else{
    		joueurCourant=getJoueur(0);
    	}
    }
    
    public int getNombrePartie(){
    	return partie;
    }
}
