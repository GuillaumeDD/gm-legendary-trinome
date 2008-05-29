import java.util.*;
import java.lang.*;
public class CaseMorpion extends Case{
	/*
	 * Les listes en java :
	 * 		http://fmora.developpez.com/tutoriel/java/collections/introduction/#L3.2
	 * 		http://java.sun.com/j2se/1.4.2/docs/api/java/util/ArrayList.html 
	 */
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
		if(adjacents.contains(c)){
			res=false;
		}
		return res;
	}
	
	public String toString(){
		int i;
		StringBuffer affichage=new StringBuffer();
		if(this.estLibre()){
			affichage.append(" ");
		}else if(this.getJoueur().getId()==0){
			affichage.append("x");
		}else if(this.getJoueur().getId()==1){
			affichage.append("o");
		}
		/*
		StringBuffer res=new StringBuffer("Id de la case : "+String.valueOf(id)+"\n");
		res.append("Cases adjacentes : ");
		for(i=0;i<adjacents.size();i++){
			res.append(adjacents.get(i).getId());
			res.append("\n");
		}
		*/
		return affichage.toString();
	}
	
	public JoueurMorpion getJoueur(){
		return (JoueurMorpion)joueur;
	}
}