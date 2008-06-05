package jeu;

public class Jeu {
	public Joueur joueurs[];
	int nombreDeJoueurs;
	Joueur joueurCourant;
	
	public Jeu(int nbJoueurs){
		nombreDeJoueurs=nbJoueurs;
		joueurs = new Joueur[nombreDeJoueurs];
	}
	
	public void jouer(){
	}
	
	public void changerJoueurCourant(){
	}
	
	public Joueur[] getJoueurs(){
		return joueurs;
	}
}
