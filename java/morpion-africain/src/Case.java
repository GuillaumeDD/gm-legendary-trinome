
public class Case {

	int id;
	boolean libre;
	Joueur joueur;
	
	public Case(){
		joueur=null;
		libre=true;
	}
	
	public Case(int identifiant){
        joueur=null;
		libre=true;
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
