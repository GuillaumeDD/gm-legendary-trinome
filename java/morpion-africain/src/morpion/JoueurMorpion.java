package morpion;
	import java.util.ArrayList;
import java.util.List;
import jeu.*;

public class JoueurMorpion extends Joueur{
	
	private List<CaseMorpion> casesOccupees = new ArrayList<CaseMorpion>();
	private int score;
	
	public JoueurMorpion(){
		super();
	}
	
	public JoueurMorpion(int i){
		super(i);
		score=0;
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
	
	public void addScore(){
		score++;
	}
	
	public int getScore(){
		return score;
	}
	
	public void jouer(CaseMorpion c) throws CaseInvalideException{	
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
	
	public List<CaseMorpion> getCasesOccupees(){
		return casesOccupees;
	}
	
	public int getCasesOccupees(int id){
		return casesOccupees.get(id).getId(); 
	}
	
	public String toString(){
		StringBuffer res=new StringBuffer();
		res.append(getNom());
		return res.toString();
	}
}
