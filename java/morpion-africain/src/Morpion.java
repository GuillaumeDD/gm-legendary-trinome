
public class Morpion extends Jeu{
	private CaseMorpion cases;
	
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
