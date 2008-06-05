package morpion;
import java.io.*;import jeu.*;
import java.util.ArrayList;
import java.util.List;
public class Morpion extends Jeu{
	DamierMorpion damier;
//on redefinit un joueurCourant de type JoueurMorpionAfricain car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	Joueur joueurCourant,joueurVainqueur,joueurTest;
	ArrayList<ArrayList<Integer>> solutions;
	
	public Morpion(){
		// on ajoute les deux joueurs
		super(2);
		joueurCourant=new JoueurMorpion();
		joueurs[0]=new JoueurMorpion();
		joueurs[1]=new JoueurMorpion();
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
      	joueurs[0].setId(0);
		joueurs[1].setId(1);
			
		joueurs[0].setJoueurPrecedent(joueurs[1]);
		joueurs[0].setJoueurSuivant(joueurs[1]);
		joueurs[1].setJoueurPrecedent(joueurs[0]);
		joueurs[1].setJoueurSuivant(joueurs[0]);
		
	                
	    // On determine le premier joueur
		joueurCourant=joueurs[0];
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
				getJoueurCourant().initialiser(damier.getCase(c-1));
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
	
	public void reinitialiser(){
		damier.reinitialiser();
		getJoueur(0).reinitialiser();
		getJoueur(1).reinitialiser();
		changerJoueurCourant();
	}
		
	public boolean fini(){
		boolean res=false;
		int i,taille;
		
		//Le test porte sur le joueur qui vient de poser un pion
		joueurTest=joueurCourant.getJoueurPrecedent();
		taille=getJoueurTest().getCasesOccupees().size();
		
		//Si 9 pions ont été joués on a fini
		if(getJoueur(0).getCasesOccupees().size()+getJoueur(1).getCasesOccupees().size()==9){
			res=true;
			joueurVainqueur=null;
		}
		
		//Si le joueur testé a posé 3 pions ou plus
		if(taille>=3 && !res){
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
}
