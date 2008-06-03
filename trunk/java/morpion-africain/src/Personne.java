
public class Personne {
	private String nom;
	
	public Personne(){
	}
	
	public Personne(String n){
	  nom = new String();
	  nom=n;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void modifierNom(String n){
		nom=n;
	}
}
