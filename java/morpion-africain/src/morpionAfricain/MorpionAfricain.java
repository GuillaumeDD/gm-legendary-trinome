package morpionAfricain;
import java.io.*;import jeu.*;
import java.util.ArrayList;
import java.util.List;
public class MorpionAfricain extends Jeu{
	DamierMorpionAfricain damier;
	int partie=0;
//on redefinit un joueurCourant de type JoueurMorpionAfricain car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	Joueur joueurCourant; 
	ArrayList<ArrayList<Integer>> solutions;
	
	public MorpionAfricain(){
		// on ajoute les deux joueurs
		super(2);
		joueurCourant=new JoueurMorpionAfricain();
		joueurs[0]=new JoueurMorpionAfricain();
		joueurs[1]=new JoueurMorpionAfricain();
		
        initialiserJoueurs();
		
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
		damier=new DamierMorpionAfricain();
		
	}
        
    public void initialiserJoueurs(){
      	joueurs[0].setId(0);
		joueurs[1].setId(1);
		
		joueurs[0].modifierNom("Joueur 1");
		joueurs[1].modifierNom("Joueur 2");
			
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
		
		int i=0;	
		if(getJoueur(0).getCasesOccupees().size()==3){
			List<Integer> casesJoueur0 = new ArrayList<Integer>();
			casesJoueur0.add(getJoueur(0).getCasesOccupees(0));
			casesJoueur0.add(getJoueur(0).getCasesOccupees(1));
			casesJoueur0.add(getJoueur(0).getCasesOccupees(2));
			
			do{
				if(
					 casesJoueur0.contains(solutions.get(i).get(0)) 
				  && casesJoueur0.contains(solutions.get(i).get(1)) 
				  && casesJoueur0.contains(solutions.get(i).get(2))
				)
					res=true;
				
				i++;
			}while(!res && i<8);
		}
		
		i=0;
		if(getJoueur(1).getCasesOccupees().size()==3 && res==false){
			List<Integer> casesJoueur1 = new ArrayList<Integer>();
			casesJoueur1.add(getJoueur(1).getCasesOccupees(0));
			casesJoueur1.add(getJoueur(1).getCasesOccupees(1));
			casesJoueur1.add(getJoueur(1).getCasesOccupees(2));

			do{
				if(
					 casesJoueur1.contains(solutions.get(i).get(0)) 
				  && casesJoueur1.contains(solutions.get(i).get(1)) 
				  && casesJoueur1.contains(solutions.get(i).get(2))
				)
				res=true;
				
			i++;
			}while(!res && i<8);
		}
		
		return res;
	}
	
	public void changerJoueurCourant(){
		joueurCourant=joueurCourant.getJoueurSuivant();
	}

	public JoueurMorpionAfricain getJoueur(int id){
		return (JoueurMorpionAfricain)joueurs[id];
	}
	
	public JoueurMorpionAfricain getJoueurCourant(){
		return (JoueurMorpionAfricain)joueurCourant;
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
