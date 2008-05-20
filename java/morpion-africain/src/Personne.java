
public class Personne {
	private StringBuffer nom = new StringBuffer("nom Personne");
	
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
