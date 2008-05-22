
public class Joueur extends Personne{

	Joueur joueurPrecedent;
	Joueur joueurSuivant;
	
	public void setJoueurPrecedent(Joueur j){
		joueurPrecedent=j;
	}
	
	public void setJoueurSuivant(Joueur j){
		joueurSuivant=j;
	}
	
	public Joueur getJoueurSuivant(){
		return joueurSuivant;
	}
	
	public Joueur getJoueurPrecedent(){
		return joueurPrecedent;
	}
	
	public void jouer(){
	}
	
	public void initialiser(){
	}
}
