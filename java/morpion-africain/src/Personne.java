
public class Personne {
	private StringBuffer nom = new StringBuffer("nom - Class Personne");
	
	public Personne(){
	}
	
	public Personne(StringBuffer nomPersonne){
	  nom=nomPersonne;			
	}
	
	public StringBuffer getNom(){
		return nom;
	}
	
	public void setNom(StringBuffer nouveauNom){
		nom=nouveauNom;
	}
}
