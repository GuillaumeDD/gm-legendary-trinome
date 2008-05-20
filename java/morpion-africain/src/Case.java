
public class Case {

	private StringBuffer nom = new StringBuffer("Case - Class Case");
	private boolean libre;
	private Joueur joueur = new Joueur(new StringBuffer("Joueur - Class Case"));
	
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
	
	public void setLibre(boolean lib){
		libre=lib;
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
