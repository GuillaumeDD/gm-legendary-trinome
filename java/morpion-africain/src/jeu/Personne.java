package jeu;

public class Personne {
	private String nom;
	
	public Personne(){
		nom=new String();
	}
	
	public Personne(String n){
	  nom = new String(n);
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String n){
		nom=n;
	}
}
