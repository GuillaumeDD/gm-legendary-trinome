package jeu;

public abstract class Joueur extends Personne{

	public Joueur joueurPrecedent;
	public Joueur joueurSuivant;
	int id;
	
	public Joueur(){
		super();
		id=0;
	}
	
	public Joueur(int i){
		super("Joueur "+(i+1));
		id=i;
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
	
	public void jouer(){
	}
	
	public void initialiser(){
	}
	
	public void setId(int identifiant){
		id=identifiant;
	}
	
	public int getId(){
		return id;
	}
}
