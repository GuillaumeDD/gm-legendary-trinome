
public class JoueurMorpion extends Joueur{
	
	private int caseOccupees[] = new int[3];
	
	private JoueurMorpion joueurPrecedent;
	private JoueurMorpion joueurSuivant;
	
	public JoueurMorpion(){
		for(int i=0;i<3;i++)
			caseOccupees[i]=0;
	}
	
	public JoueurMorpion(StringBuffer n){
		for(int i=0;i<3;i++)
			caseOccupees[i]=0;
		setNom(n);
	}
	
	public void setJoueurPrecedent(JoueurMorpion j){
		joueurPrecedent=j;
	}
	
	public void setJoueurSuivant(JoueurMorpion j){
		joueurSuivant=j;
	}
	
	public JoueurMorpion getJoueurPrecedent(){
		return joueurPrecedent;
	}
	
	public JoueurMorpion getJoueurSuivant(){
		return joueurSuivant;
	}
	
	public void initialiser(Case c){
/* Test pour savoir si la case est bien libre ? */		
		c.setLibre(false,this);
		c.setJoueur(this);
	}
	
	public void jouer(Case origine,Case destination){
/* Tests pour savoir si la case destination est libre 
 * et si la case origine est  bien au joueur*/
		origine.setLibre(true,null);
		destination.setLibre(false,this);
	}

}
