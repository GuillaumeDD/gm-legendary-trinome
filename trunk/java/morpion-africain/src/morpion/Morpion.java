package morpion;
import java.io.*;import jeu.*;
import java.util.ArrayList;
import java.util.List;
public class Morpion extends Jeu{
	DamierMorpion damier;
//on redefinit un joueurCourant de type JoueurMorpionAfricain car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	Joueur joueurCourant,joueurVainqueur;
	
	
	public Morpion(){
		// on ajoute les deux joueurs
		super(2);
		joueurCourant=new JoueurMorpion();
		joueurs[0]=new JoueurMorpion();
		joueurs[1]=new JoueurMorpion();
		joueurVainqueur= new JoueurMorpion();
        initialiserJoueurs();
		
		damier=new DamierMorpion();
		
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
		joueurVainqueur=null;
    }
        
	public void jouer(){
		int i=0;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

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
		switch(joueurVainqueur.getId()){
			case 0 : System.out.println(joueurs[0]+" est vainqueur");break;
			case 1 : System.out.println(joueurs[0]+" est vainqueur");break;
			default : System.out.println("Pas de vainqueur");break;
		}
		
		// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
		System.out.println(damier);
		//!!!
	}
	
	public void reinitialiser(){
		damier.reinitialiser();
		getJoueur(0).reinitialiser();
		getJoueur(1).reinitialiser();
		changerJoueurCourant();
	}
		
	public boolean fini(){
		boolean res=false;
		
		ArrayList<ArrayList<Integer>> solutions = new ArrayList<ArrayList<Integer>>();
		
		
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

		int i=0;
		int tailleJ0=0,tailleJ1=0;
		if(getJoueur(0).getCasesOccupees().size()==3){
			tailleJ0=getJoueur(0).getCasesOccupees().size();
			List<Integer> casesJoueur0 = new ArrayList<Integer>();
			
			for(i=0;i<tailleJ0;i++)
				casesJoueur0.add(getJoueur(0).getCasesOccupees(i));
			
			i=0;
			do{
				if(
					 casesJoueur0.contains(solutions.get(i).get(0)) 
				  && casesJoueur0.contains(solutions.get(i).get(1)) 
				  && casesJoueur0.contains(solutions.get(i).get(2))
				){
					res=true;
					joueurVainqueur=getJoueur(0);
				}
				
				i++;
			}while(!res && i<tailleJ0);
		}
		
		i=0;
		if(getJoueur(1).getCasesOccupees().size()==3 && res==false){
			tailleJ1=getJoueur(0).getCasesOccupees().size();
			List<Integer> casesJoueur1 = new ArrayList<Integer>();
			
			for(i=0;i<tailleJ1;i++)
				casesJoueur1.add(getJoueur(1).getCasesOccupees(i));

			do{
				if(
					 casesJoueur1.contains(solutions.get(i).get(0)) 
				  && casesJoueur1.contains(solutions.get(i).get(1)) 
				  && casesJoueur1.contains(solutions.get(i).get(2))
				){
					res=true;
					joueurVainqueur=getJoueur(1);
				}
				
			i++;
			}while(!res && i<tailleJ1);
		}
		if(tailleJ0+tailleJ1==9)
			res=true;
		
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
}
