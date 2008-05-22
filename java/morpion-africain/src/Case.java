
public class Case {

	private StringBuffer nom;
	private boolean libre;
	private Joueur joueur;
	
	public Case(){
	}
	
	public Case(StringBuffer nomCase){
		nom=nomCase;
	}
	
	public void setNom(StringBuffer nomCase){
		nom=nomCase;
	}
	
	public StringBuffer getNom(){
		return nom;
	}
	
	public void setLibre(boolean lib,Joueur j){
		libre=lib;
		joueur=j;
	}
	
	public boolean getLibre(){
		return libre;
	}
	
	public void setJoueur(Joueur j){
		joueur = j;
	}
	
	public Joueur getJoueur(){
		return joueur;
	}
}
