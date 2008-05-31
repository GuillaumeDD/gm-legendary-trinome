	import java.util.ArrayList;
import java.util.List;


public class JoueurMorpion extends Joueur{
	
	private List<CaseMorpion> casesOccupees = new ArrayList<CaseMorpion>();
	private int score;
	
	public JoueurMorpion(){
		score=0;
	}
	
	public JoueurMorpion(StringBuffer n){
		score=0;
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
	
	public void setScore(int s){
		score=s;
	}
	
	public int getScore(){
		return score;
	}
	
	public void initialiser(CaseMorpion c) throws CaseInvalideException{
/* Test pour savoir si la case est bien libre ? */		
		if(c.getLibre()){
			c.setLibre(false,this);
			ajouterCaseOccupee(c);
		}else{
			throw new CaseInvalideException();
		}
		
	}
	
	public void reinitialiser(){
		casesOccupees.clear();
	}
	
	public void jouer(CaseMorpion origine,CaseMorpion destination) throws CaseInvalideException{
/* Tests pour savoir si la case destination est libre 
 * et si la case origine est  bien au joueur*/
		if(estUneCaseOccupee(origine) && destination.getLibre()){
			origine.setLibre(true,null);
			destination.setLibre(false,this);
			supprimerCaseOccupee(origine);
			ajouterCaseOccupee(destination);
		}else{
			throw new CaseInvalideException();			
		}
	}
	
	public void ajouterCaseOccupee(CaseMorpion c){
		casesOccupees.add(c);
	}
	
	public void supprimerCaseOccupee(CaseMorpion c){
		casesOccupees.remove(c);		
	}
	
	public boolean estUneCaseOccupee(CaseMorpion c){
		boolean res=true;
		if(!casesOccupees.contains(c)){
			res=false;
		}
		return res;
	}
	
	public int getCasesOccupees(int id){
		return casesOccupees.get(id).getId(); 
	}
	
	public String toString(){
		StringBuffer res=new StringBuffer();
		res.append("Joueur ");
		res.append(id+1);
		return res.toString();
	}
}
