
public class Morpion extends Jeu{
	private CaseMorpion cases[] = new CaseMorpion[9];
//on redefinit un joueurCourant de type JoueurMorpion car il doit pouvoir utiliser les méthodes initialiser() et jouer()
	private JoueurMorpion joueurCourant; 
	
	public Morpion(){
		
	}
	
	public void creerCases(){
		
	}
	public void creerJoueurs(){
		
	}
	public void initialiser(){
		int i;
		for(i=0;i<6;i++){
			joueurCourant.initialiser();
			changerJoueurCourant();
		}
	}
	public void jouer(){
		while(!fini()){
			joueurCourant.jouer();
			changerJoueurCourant();
		}
	}
	public boolean fini(){
		return true;
	}
	public void changerJoueurCourant(){
		joueurCourant=joueurCourant.getJoueurSuivant();
	}
}
