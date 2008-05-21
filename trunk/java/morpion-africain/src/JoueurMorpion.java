
public class JoueurMorpion extends Joueur{
	
	private int caseOccupees[] = new int[3];
	
	public JoueurMorpion(){
		for(int i=0;i<3;i++)
			caseOccupees[i]=0;
	}
	
	public JoueurMorpion(StringBuffer n){
		for(int i=0;i<3;i++)
			caseOccupees[i]=0;
		setNom(n);
	}
	
	public void initialiser(Case c){
/* Test pour savoir si la case est bien libre ? */		
		c.setLibre(false);
		c.setJoueur(this);
	}
	
	public void jouer(Case c){
		
	}

}
