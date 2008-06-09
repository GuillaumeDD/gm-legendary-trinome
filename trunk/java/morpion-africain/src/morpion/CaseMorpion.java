package morpion;
import jeu.*;
import java.util.*;
public class CaseMorpion extends Case{
	
	List<CaseMorpion> adjacents = new ArrayList<CaseMorpion>();	
	
	public CaseMorpion(){
		super();
	}
	
	public CaseMorpion(int identifiant){
		super(identifiant);
	}
	
	public void ajouterAdjacent(CaseMorpion caseAdjacent){
		adjacents.add(caseAdjacent);
	}
	
	public boolean estAdjacent(CaseMorpion c){
		boolean res=true;
		if(!adjacents.contains(c)){
			res=false;
		}
		return res;
	}
	
	public String toString(){
		StringBuffer affichage=new StringBuffer();
		if(this.getLibre()){
			affichage.append(" ");
		}else if(this.getJoueur().getId()==0){
			affichage.append("x");
		}else if(this.getJoueur().getId()==1){
			affichage.append("o");
		}
		return affichage.toString();
	}
	
	public JoueurMorpion getJoueur(){
		return (JoueurMorpion)super.getJoueur();
	}
}
	
