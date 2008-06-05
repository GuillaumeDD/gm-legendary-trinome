package morpionAfricain;
import jeu.*;
import java.util.*;
public class CaseMorpionAfricain extends Case{
	/*
	 * Les listes en java :
	 * 		http://fmora.developpez.com/tutoriel/java/collections/introduction/#L3.2
	 * 		http://java.sun.com/j2se/1.4.2/docs/api/java/util/ArrayList.html 
	 */
	List<CaseMorpionAfricain> adjacents = new ArrayList<CaseMorpionAfricain>();	
	
	public CaseMorpionAfricain(){
		super();
	}
	
	public CaseMorpionAfricain(int identifiant){
		super(identifiant);
	}
	
	public void ajouterAdjacent(CaseMorpionAfricain caseAdjacent){
		adjacents.add(caseAdjacent);
	}
	
	public boolean estAdjacent(CaseMorpionAfricain c){
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
	
	public JoueurMorpionAfricain getJoueur(){
		return (JoueurMorpionAfricain)super.getJoueur();
	}
}
