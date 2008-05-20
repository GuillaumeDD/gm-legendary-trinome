
public class Joueur extends Personne{

	private Joueur joueurPrecedent = new Joueur();
	private Joueur joueurSuivant   = new Joueur();
	
	public Joueur(){
	}
	
	public Joueur(StringBuffer nomJoueur){
		setNom(nomJoueur);
	}
	
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
}
