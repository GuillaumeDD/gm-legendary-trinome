import java.util.ArrayList;
import java.util.List;


public class JoueurMorpion extends Joueur{
	
	private List<CaseMorpion> casesOccupees = new ArrayList<CaseMorpion>();
	
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
	
	public void initialiser(CaseMorpion c){
/* Test pour savoir si la case est bien libre ? */		
		c.setLibre(false,this);
		c.setJoueur(this);
		ajouterCaseOccupee(c);
	}
	
	public void jouer(CaseMorpion origine,CaseMorpion destination){
/* Tests pour savoir si la case destination est libre 
 * et si la case origine est  bien au joueur*/
		origine.setLibre(true,null);
		destination.setLibre(false,this);
		supprimerCaseOccupee(origine);
		ajouterCaseOccupee(destination);
	}
	
	public void ajouterCaseOccupee(CaseMorpion c){
		casesOccupees.add(c);
	}
	
	public void supprimerCaseOccupee(CaseMorpion c){
		casesOccupees.remove(c);		
	}
	
	public boolean estUneCaseOccupee(CaseMorpion c){
		boolean res=true;
		if(casesOccupees.indexOf(c)==-1){
			res=false;
		}
		return res;
	}
	
	public int getCaseOccupee(int id){
		return casesOccupees.get(id).getId(); 
	}
}
