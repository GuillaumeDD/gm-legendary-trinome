
public class JoueurMorpion extends Joueur{
	
	private CaseMorpion caseOccupees;
	
	public JoueurMorpion(){
	}
	
	public JoueurMorpion(StringBuffer n){
		setNom(n);
	}
	
	public void setJoueurPrecedent(Joueur j){
		joueurPrecedent=j;
	}
	
	public void setJoueurSuivant(Joueur j){
		joueurSuivant=j;
	}
	
	public Joueur getJoueurPrecedent(){
		return joueurPrecedent;
	}
	
	public Joueur getJoueurSuivant(){
		return joueurSuivant;
	}
	
	public void initialiser(Case c){
/* Test pour savoir si la case est bien libre ? */		
		c.setLibre(false,this);
		c.setJoueur(this);
	}
	public void initialiser(){
		
	}
	public void jouer(){
		
	}
	public void jouer(CaseMorpion origine,CaseMorpion destination){
/* Tests pour savoir si la case destination est libre 
 * et si la case origine est  bien au joueur*/
		origine.setLibre(true,null);
		destination.setLibre(false,this);
	}
	
}
