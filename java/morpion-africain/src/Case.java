
public class Case {

	int id;
	boolean libre;
	Joueur joueur;
	
	public Case(){
		joueur=null;
		libre=true;
	}
	
	public Case(int identifiant){
		id=identifiant;
	}
	
	public void setId(int identifiant){
		id=identifiant;
	}
	
	public int getId(){
		return id;
	}
	
	public void setLibre(boolean lib,Joueur j){
		libre=lib;
		joueur=j;
	}
	
	public boolean estLibre(){
		return libre;
	}
	
	public void setJoueur(Joueur j){
		joueur = j;
	}
	
	public Joueur getJoueur(){
		return joueur;
	}
}