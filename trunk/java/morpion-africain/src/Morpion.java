import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Morpion extends Jeu{
	//private CaseMorpion cases[] = new CaseMorpion[9];
	private damierMorpion damier;
//on redefinit un joueurCourant de type JoueurMorpion car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	private Joueur joueurCourant; 
	
	public Morpion(){
		// on ajoute les deux joueurs
		super(2);
		joueurCourant=new JoueurMorpion();
		joueurs[0]=new JoueurMorpion();
		joueurs[1]=new JoueurMorpion();
		
		joueurs[0].setId(0);
		joueurs[1].setId(1);
		
		joueurs[0].setJoueurPrecedent(joueurs[1]);
		joueurs[0].setJoueurSuivant(joueurs[1]);
		joueurs[1].setJoueurPrecedent(joueurs[0]);
		joueurs[1].setJoueurSuivant(joueurs[0]);
		
		// On determine le premier joueur
		joueurCourant=joueurs[0];
		
		damier=new damierMorpion();
		
	}

	public void initialiser(){
		int i;
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));


		int c=0;	
		for(i=0;i<6;i++){
			do{
				try {
					c=Integer.parseInt(entree.readLine());
				} catch( IOException e ) {e.printStackTrace();}
			}while(!damier.getCase(c-1).estLibre());
			((JoueurMorpion)joueurCourant).initialiser(damier.getCase(c-1));
			changerJoueurCourant();


		}
		// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
		System.out.println(damier);
		//!!!
	}
	
	public void reinitialiser(){
		damier.reinitialiser();
		((JoueurMorpion)joueurs[0]).reinitialiser();
		((JoueurMorpion)joueurs[1]).reinitialiser();
		changerJoueurCourant();
	}
	
	public void jouer(){
		BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
		int o,d;
		o=0;
		d=0;
		
		while(!fini()){
			//Tant que les case selectionnées ne sont pas valide (ie : o est au joueur et d est libre) on rerentre les valeurs
			do{
				try {
					o=Integer.parseInt(entree.readLine());
					d=Integer.parseInt(entree.readLine());
				} catch( IOException e ) {e.printStackTrace();}
			}while(damier.getCase(o-1).getJoueur()!=(JoueurMorpion)joueurCourant || damier.getCase(d-1).getJoueur()!=null);
			((JoueurMorpion)joueurCourant).jouer(damier.getCase(o-1),damier.getCase(d-1));
			changerJoueurCourant();
			// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
			System.out.println(damier);
			//!!!
		}
		changerJoueurCourant();
		((JoueurMorpion)joueurCourant).setScore(((JoueurMorpion)joueurCourant).getScore()+1);
		System.out.println("Victoire du Joueur : "+ (joueurCourant.getId()+1));
		System.out.println("Scores : J1 - "+((JoueurMorpion)joueurs[0]).getScore()+" J2 - "+((JoueurMorpion)(joueurs[1].getJoueurSuivant())).getScore());
	}
	
	public boolean fini(){
		boolean res=false;
		
		ArrayList<ArrayList<Integer>> solutions = new ArrayList<ArrayList<Integer>>();
		
		List<Integer> casesJoueur0 = new ArrayList<Integer>();
		List<Integer> casesJoueur1 = new ArrayList<Integer>();
		
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
	    		
		casesJoueur0.add(((JoueurMorpion)joueurs[0]).getCasesOccupees(0));
		casesJoueur0.add(((JoueurMorpion)joueurs[0]).getCasesOccupees(1));
		casesJoueur0.add(((JoueurMorpion)joueurs[0]).getCasesOccupees(2));
		casesJoueur1.add(((JoueurMorpion)joueurs[1]).getCasesOccupees(0));
		casesJoueur1.add(((JoueurMorpion)joueurs[1]).getCasesOccupees(1));
		casesJoueur1.add(((JoueurMorpion)joueurs[1]).getCasesOccupees(2));
		
		int i=0;
		do{
			if(
				(
				     casesJoueur0.contains(solutions.get(i).get(0)) 
				  && casesJoueur0.contains(solutions.get(i).get(1)) 
				  && casesJoueur0.contains(solutions.get(i).get(2))
				)
				||  
				(
					 casesJoueur1.contains(solutions.get(i).get(0)) 
				  && casesJoueur1.contains(solutions.get(i).get(1)) 
				  && casesJoueur1.contains(solutions.get(i).get(2))
				 )
			  ){
				res=true;
			}
			i++;
		}while(!res && i<8);
		
		return res;
	}
	
	public void changerJoueurCourant(){
		joueurCourant=joueurCourant.getJoueurSuivant();
	}

	public JoueurMorpion getJoueur(int id){
		return (JoueurMorpion)joueurs[id];
	}
}
