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
			try {
		        c=Integer.parseInt(entree.readLine());
			} catch( IOException e ) {e.printStackTrace();}
			((JoueurMorpion)joueurCourant).initialiser(damier.getCase(c-1));
			changerJoueurCourant();


		}
		// !!! AFFICHAGE EN CONSOLE A SUPPRIMER PLUS TARD !!!
		System.out.println(damier);
		//!!!
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
	}
	
	public boolean fini(){
		boolean res=false;
		
		List<Integer> solution1 = new ArrayList<Integer>();
		List<Integer> solution2 = new ArrayList<Integer>();
		List<Integer> solution3 = new ArrayList<Integer>();
		List<Integer> solution4 = new ArrayList<Integer>();
		List<Integer> solution5 = new ArrayList<Integer>();
		List<Integer> solution6 = new ArrayList<Integer>();
		List<Integer> solution7 = new ArrayList<Integer>();
		List<Integer> solution8 = new ArrayList<Integer>();
		
		List<Integer> casesJoueur0 = new ArrayList<Integer>();
		List<Integer> casesJoueur1 = new ArrayList<Integer>();
		
		solution1.add(0);
		solution1.add(1);
		solution1.add(2);
		solution2.add(3);
		solution2.add(4);
		solution2.add(5);
		solution3.add(6);
		solution3.add(7);
		solution3.add(8);
		solution4.add(0);
		solution4.add(3);
		solution4.add(6);
		solution5.add(1);
		solution5.add(4);
		solution5.add(7);
		solution6.add(2);
		solution6.add(5);
		solution6.add(8);
		solution7.add(0);
		solution7.add(4);
		solution7.add(8);
		solution8.add(2);
		solution8.add(4);
		solution8.add(6);
		
		casesJoueur0.add((JoueurMorpion)joueurs[0]).getCasesOccupees(0));
		
		for(int i=0;i<7;i++){
			
			if(damier.getCase(gagne[i][1]).getJoueur()==damier.getCase(gagne[i][2]).getJoueur() && damier.getCase(gagne[i][1]).getJoueur()==damier.getCase(gagne[i][3]).getJoueur()){
				res=true;
			}
		}
		
		return res;
	}
	
	public void changerJoueurCourant(){
		joueurCourant=joueurCourant.getJoueurSuivant();
	}

	public JoueurMorpion getJoueur(int id){
		return (JoueurMorpion)joueurs[id];
	}
}
