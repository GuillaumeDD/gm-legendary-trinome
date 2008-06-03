	import java.util.ArrayList;
import java.util.List;


public class JoueurMorpionAfricain extends Joueur{
	
	private List<CaseMorpionAfricain> casesOccupees = new ArrayList<CaseMorpionAfricain>();
	private int score;
	
	public JoueurMorpionAfricain(){
		super();
	}
	
	public JoueurMorpionAfricain(int i){
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
	
	public void initialiser(CaseMorpionAfricain c) throws CaseInvalideException{
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
	
	public void jouer(CaseMorpionAfricain origine,CaseMorpionAfricain destination) throws CaseInvalideException{
/* Tests pour savoir si la case destination est libre 
 * et si la case origine est  bien au joueur*/
		if(estUneCaseOccupee(origine) && destination.getLibre() && origine.estAdjacent(destination) && destination.estAdjacent(origine)){
			origine.setLibre(true,null);
			destination.setLibre(false,this);
			supprimerCaseOccupee(origine);
			ajouterCaseOccupee(destination);
		}else{
			throw new CaseInvalideException();			
		}
	}
	
	public void ajouterCaseOccupee(CaseMorpionAfricain c){
		casesOccupees.add(c);
	}
	
	public void supprimerCaseOccupee(CaseMorpionAfricain c){
		casesOccupees.remove(c);		
	}
	
	public boolean estUneCaseOccupee(CaseMorpionAfricain c){
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
		res.append(getNom());
		return res.toString();
	}
}
